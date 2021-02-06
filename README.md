Here we have tried to clone OLX india, an e-marketplace application where a user can advertise/buy/sell any used products online.
We mainly used the concepts of RecyclerView , Retrofit, Fragments and Shared Preferences along with intents.
While designing we mostly used Constraint and nested linear/relative layouts.
We made use of live data instead of creating assets as the OLX Api's could be extracted online.
We made use of third party dependencies like glide for imageView, Toasty for toast messages, Retrofit for handling Api's respectively.

Following below is the code for Retrofit dependency

     implementation 'com.squareup.retrofit2:retrofit:2.5.0'
     implementation 'com.squareup.retrofit2:converter-gson:2.5.0'
  
Following below is the code for Glide dependency

    implementation 'com.google.code.gson:gson:2.8.6'
    implementation 'com.github.bumptech.glide:glide:4.11.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.11.0'
 
 
 Following below is the code for Toasty dependency
 
    implementation 'javax.annotation:javax.annotation-api:1.3.2'
    implementation 'com.github.GrenderG:Toasty:1.4.0'
    
