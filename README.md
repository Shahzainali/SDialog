# SDialog
A simple and easy to use Dialog build using Android Dialog,

[![](https://jitpack.io/v/Shahzainali/SDialog.svg)](https://jitpack.io/#Shahzainali/SDialog)


### Installation


Add it in your root build.gradle at the end of repositories:
```sh
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.Shahzainali:SDialog:1.1.0'
	}
```
### Usage
```sh
SDialog.Builder(this)
    .setTitle("My Dialog")  
    .setMessage("this")
    .setDuration(5000) //how long dialog will display
    .setSpeed(400) //animation speed
    .setType(SDialog.FAIL) //FAIL or SUCCESS
    .setCancellable(false)
    .build()
```
| Email | shahzainali93@gmail.com |
| Linkedin | https://www.linkedin.com/in/shahzainali/ |
| stackoverflow | https://stackoverflow.com/users/5154783/shahzain-ali |



