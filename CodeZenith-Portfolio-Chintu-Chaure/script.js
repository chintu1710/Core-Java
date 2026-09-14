const $ = s => document.querySelector(s);
const $$ = s => document.querySelectorAll(s);

// Loader
let progress = 0;
const loaderBar = $("#loaderBar"), loaderPercent = $("#loaderPercent"), loader = $("#loader");
const timer = setInterval(() => {
  progress += Math.floor(Math.random()*9)+4;
  if(progress >= 100){
    progress = 100;
    clearInterval(timer);
    setTimeout(() => loader.classList.add("done"), 350);
    setTimeout(() => loader.remove(), 750);
  }
  loaderBar.style.width = progress + "%";
  loaderPercent.textContent = progress + "%";
}, 90);

// Mobile navigation
$("#menuBtn").addEventListener("click", () => $("#nav").classList.toggle("open"));
$$('#nav a').forEach(a => a.addEventListener('click', () => $("#nav").classList.remove("open")));

// Reveal animations
const observer = new IntersectionObserver(entries => {
  entries.forEach(entry => {
    if(entry.isIntersecting) entry.target.classList.add("visible");
  });
}, {threshold:.12});
$$(".reveal").forEach(el => observer.observe(el));

// CV demo download
$("#cvButton").addEventListener("click", () => {
  const cv = `CHINTU CHAURE\nFull Stack Developer\nIndore, Madhya Pradesh\n\nEducation:\nB.Tech Computer Science - RGPV (2023-2027)\nDCAA - RGCSM (2024)\n\nSkills:\nJava, HTML, CSS, JavaScript, React, Spring Boot, MySQL, Python, Git, GitHub\n\nGitHub: https://github.com/chintu1710`;
  const blob = new Blob([cv], {type:"text/plain"});
  const url = URL.createObjectURL(blob);
  const a = document.createElement("a");
  a.href = url; a.download = "Chintu-Chaure-CV.txt"; a.click();
  URL.revokeObjectURL(url);
  toast("CV demo downloaded. Replace it with your PDF CV.");
});

// Contact form
$("#contactForm").addEventListener("submit", e => {
  e.preventDefault();
  const name = $("#name").value.trim();
  const email = $("#email").value.trim();
  const msg = $("#message").value.trim();
  if(!name || !email || !msg) return;
  toast("Message submitted successfully!");
  e.target.reset();
});

// Chat assistant
const chatBox = $("#chatBox"), chatMessages = $("#chatMessages");
$("#chatToggle").addEventListener("click", () => chatBox.classList.toggle("open"));
$("#chatClose").addEventListener("click", () => chatBox.classList.remove("open"));
$("#chatForm").addEventListener("submit", e => {
  e.preventDefault();
  const input = $("#chatInput"), text = input.value.trim();
  if(!text) return;
  addChat(text, "user");
  input.value = "";
  setTimeout(() => {
    const t = text.toLowerCase();
    let reply = "Thanks for your message! You can use the Contact section to get in touch with Chintu.";
    if(t.includes("skill")) reply = "Chintu's portfolio highlights Java, JavaScript, React, Spring Boot, databases, Python, Git and GitHub.";
    if(t.includes("project")) reply = "Check the Featured Projects section to see the showcased work.";
    if(t.includes("contact") || t.includes("email")) reply = "You can reach out through the contact form or the email shown in the Contact section.";
    addChat(reply, "bot");
  }, 500);
});
function addChat(text, type){
  const div = document.createElement("div");
  div.className = type === "user" ? "user-msg" : "bot-msg";
  div.textContent = text;
  chatMessages.appendChild(div);
  chatMessages.scrollTop = chatMessages.scrollHeight;
}

// Top button
const topBtn = $("#topBtn");
window.addEventListener("scroll", () => {
  topBtn.style.display = window.scrollY > 500 ? "block" : "none";
});
topBtn.addEventListener("click", () => window.scrollTo({top:0, behavior:"smooth"}));

function toast(text){
  const t = $("#toast");
  t.textContent = text; t.classList.add("show");
  setTimeout(() => t.classList.remove("show"), 2600);
}

// Active nav item
const sections = $$("main section");
window.addEventListener("scroll", () => {
  let current = "home";
  sections.forEach(sec => {
    if(window.scrollY >= sec.offsetTop - 180) current = sec.id;
  });
  $$("#nav a").forEach(a => a.classList.toggle("active", a.getAttribute("href") === "#" + current));
});
