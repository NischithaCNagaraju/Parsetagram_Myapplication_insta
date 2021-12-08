# Parsetagram_Myapplication_insta

**Parsetagram** is a photo sharing app similar to Instagram but using Parse as its backend.
Parse provides a cloud-based backend service to build data-driven mobile apps quickly. It has become an open source version that enables developers to use Parse to build apps.

**What is Parse?**

Parse is an open-source Android SDK and back-end solution that enables developers to build mobile apps with shared data quickly and without writing any back-end code or custom APIs.

<img width="476" alt="Parse" src="https://user-images.githubusercontent.com/61173798/145263938-a008fb23-0f88-4373-8151-8ecee2be3109.PNG">


Features of Parse (combining the mobile SDK and back-end service):

```
Data Modeling
Create and expose REST APIs
User registration and authentication
Creating, querying, modifying and deleting arbitrary data models
Real-time notifications
Uploading files to a server for access across clients.
```


# Architecture of my Android App

<img width="464" alt="Insta_architecture" src="https://user-images.githubusercontent.com/61173798/145169179-78531da7-2631-40a5-ab96-172b5b76ba42.PNG">


The platform exposes a set of services and each service performs a dedicated function. Each of these services exposes a set of APIs to allow interactions from the client
app (Android-based app the user uses). Further, each of these services uses a used Back4app data store to store the data belonging to the services. The first step is to 
validate the request from the user and persist (inserts or updates) the data in its data store.

**Project Set-Up**
 
**Set up Parse server**

Setting up of the parse server is carried out before building the application.

**Deploying with back4app:**
 
back4app allows you to manage changes to deploy easily by specifying a GitHub repository to use. In addition, it comes with a UI data viewer from mLab.

  1.Sign In to back4app
 
  2.Select build new app

<img width="464" alt="dashboard" src="https://user-images.githubusercontent.com/61173798/145264359-66929241-3c7c-425d-981d-216ae6b651f5.PNG">

  3.Enter a name for your app and click Create.

  4.Once the setup is finished, you should see the dashboard for your app.

<img width="477" alt="dashboard" src="https://user-images.githubusercontent.com/61173798/145264712-6d71de7f-8369-4f5f-8eaf-7f304daf7f51.PNG">

**Install parse SDK**

**Initialize SDK**

<img width="477" alt="Initialize" src="https://user-images.githubusercontent.com/61173798/145265405-d161ee36-c61f-4ffa-ac3a-884357917226.PNG">

**Setup network permisiions**

**Parse Dashboard**

It allows us to see how data gets added to your Parse server.


<img width="510" alt="dashboard" src="https://user-images.githubusercontent.com/61173798/145265719-da592275-3139-4b25-9d61-f32373caa90a.PNG">


**Functionalities of Parsetagram**

**Working with Users**
Parse has a specialized ParseUser as a part of their SDK which handles the functionality of users accessing their information in a secure manner.

**Functionalities of the App:**

[x] User can sign up to create a new account using Parse authentication.
[x] User can log in and log out of his or her account
[x] The current signed in user is persisted across app restarts
[x] User can take a photo, add a caption, and post it to "Parsetagram"
[x] User can view the last 20 posts submitted to "Parsetagram" 
[x] The user should switch between different tabs - viewing all posts (feed view), compose (capture photos from camera) and profile tabs (posts made) using fragments and a Bottom Navigation View.




