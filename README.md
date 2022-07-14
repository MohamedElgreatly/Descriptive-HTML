# Descriptive-HTML
make small compiler to html code
Example
People with no technical background may find learning HTML a difficult thing, so you will make
their life easier by designing a language that describes the web page (WHAT the user needs?)
instead of telling the browser (HOW to render the page?).
For example, the user will write something like the following

ADD IMAGE WITH SOURCE "https://www.w3schools.com/html/pic_trulli.jpg"
ADD HEADING WITH TEXT "Hello World"
ADD PARAGRAPH WITH TEXT "Welcome" AND WITH FONT "Arial" AND WITH COLOR "Red"
ADD LINK WITH TEXT "Search" AND WITH LINK "http://google.com"
ADD LINK WITH TEXT "Email" AND WITH LINK "http://gmail.com" WITH COLOR "Green"
ADD PARAGRAPH WITH WITH FONT "Arial" AND TEXT "Good bye"

Which will generate the following HTML

<img src="https://www.w3schools.com/html/pic_trulli.jpg" />
<h1>Hello World</h1>
<p style="color:Red;font-family:Arial;">Welcome</p>
<a href="http://google.com">Search</a>
<a href="http://gmail.com" style="color:Green;">Email</a>
<p style="font-family:Arial;">Good bye</p>
