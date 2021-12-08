# Parsetagram_Myapplication_insta

**Parsetagram** is a photo sharing app similar to Instagram but using Parse as its backend.
Parse provides a cloud-based backend service to build data-driven mobile apps quickly. It has become an open source version that enables developers to use Parse to build apps.

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


