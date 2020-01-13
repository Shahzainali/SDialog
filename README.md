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
                .setTitle("My Dialog")                  //set title
                .setMessage("this")                     //set message
                .setDuration(5000)                      //how long dialog will display
                .setSpeed(400)                          //animation speed
                .setCancellable(false)
                .setBackgroundColor(Color.DKGRAY)       
                .setTitleColor(Color.WHITE)
                .setMessageColor(Color.WHITE)
                .setImage(R.drawable.cross)             //optional
                .setImageTint(Color.CYAN)
                .build()
```

![](sdialog.gif)


### Contact
```sh
| Email |           shahzainali93@gmail.com |
| Linkedin |        https://www.linkedin.com/in/shahzainali/ |
| stackoverflow |   https://stackoverflow.com/users/5154783/shahzain-ali |
```


