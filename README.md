🌐 Translation Desktop Application (JavaFX Client-Server)
📌 Overview

This project is a desktop-based translation system built using a client-server architecture. It allows users to translate text between different languages through an intuitive JavaFX interface while handling processing on a backend server.

The system is designed to simulate a real-world translation service with additional features like language detection, OCR, and speech-to-text support.

⚙️ Tech Stack
Frontend (Client): JavaFX
Backend (Server): Java
Architecture: Client–Server
Build Tool: Maven
✨ Features
🌍 Text translation between multiple languages
🔍 Automatic language detection
🖼️ OCR (Extract text from images)
🎤 Speech-to-text support
🚦 Rate limiting for requests
🎨 Simple and clean UI with theme support
🏗️ Project Structure
project/
│── client/     → JavaFX desktop application
│── server/     → Backend server handling requests
│── shared/     → Common models used by both client & server
│── pom.xml     → Maven configuration
🚀 How to Run
1. Clone the repository
git clone https://github.com/unmoha/your-repo-name.git
cd your-repo-name
2. Start the Server
cd server
mvn clean install
mvn exec:java
3. Start the Client
cd client
mvn clean install
mvn javafx:run
🔄 How It Works
The client (JavaFX app) sends a translation request
The server processes the request using services
The response is sent back and displayed in the UI
📷 Example Use Cases
Translate text instantly
Detect unknown language
Extract text from images and translate
Convert speech into text and translate
🎯 Future Improvements
Add more language support
Improve UI/UX design
Integrate external translation APIs
Add user authentication
👤 Author

Anwar Mohammed
📧 anwarmoha7926@gmail.com

📱 +251978810378
🔗 GitHub: https://github.com/unmoha

📄 License

This project is for educational purposes and can be freely modified.
