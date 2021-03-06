package com.example.parsebasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


/*

    // //Adding Info in parse server

    //Create Video Game to save score
    //Class is like a table

    ParseObject score = new ParseObject("Score");

    //     Column Name  Below it
    score.put("username","sean");
    score.put("score",85);


    //to save it in parse
    score.saveInBackground(new SaveCallback() {
      @Override
      public void done(ParseException e)
      {
        if(e == null)
        {
          // OK
          Log.i("Success","We saved the score");
        }
        else
        {
          e.printStackTrace();
        }
      }
    });

 */

/*

    //To get info from parse server

    ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");
    //Pass object id from parse server
    query.getInBackground("Bj2338YD6x", new GetCallback<ParseObject>() {
      @Override
      public void done(ParseObject object, ParseException e)
      {
        if(e == null && object != null)
        {
          // OK
          //Updating Info
          object.put("score",85);
          object.saveInBackground();

          Log.i("Username",object.getString("username"));
          Log.i("Score",Integer.toString(object.getInt("score")));

        }
        else
        {
          e.printStackTrace();
        }


      }
    });

 */

/*
    // To grab all the objects

    ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");

    // TO SEARCH FOR AN OBJECT
    query.whereEqualTo("username","nick");
    query.setLimit(1);

    // to get everything
    query.findInBackground(new FindCallback<ParseObject>() {
      @Override
      public void done(List<ParseObject> objects, ParseException e)
      {
        if(e == null )
        {
          if(objects.size() > 0)
          {
            for (ParseObject object : objects)
            {
              Log.i("Username", object.getString("username"));
              Log.i("Score", Integer.toString(object.getInt("score")));
            }
          }
        }
        else
        {
          e.printStackTrace();
        }
      }
    });


 */

/*

    //  TO GET A PERSON WHOSE SCORE IS GREATER THAN 50, GIVE THEM ADDITIONAL 20 POINTS


    ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");

    // TO SEARCH FOR AN OBJECT
    query.whereGreaterThan("score",50);

    // to get everything
    query.findInBackground(new FindCallback<ParseObject>() {
      @Override
      public void done(List<ParseObject> objects, ParseException e)
      {
        if(e == null )
        {
          if(objects.size() > 0)
          {
            for (ParseObject object : objects)
            {
              object.put("score",object.getInt("score")+20);
              object.saveInBackground();
              Log.i("Username", object.getString("username"));
              Log.i("Score", Integer.toString(object.getInt("score")));
            }
          }
        }
        else
        {
          e.printStackTrace();
        }
      }
    });

*/


/*

    // SIGN UP CODE
    //Creating a new User

    ParseUser user = new ParseUser();
    user.setUsername("nick");
    user.setPassword("myPass");

    // Sing up a user
    user.signUpInBackground(new SignUpCallback() {
      @Override
      public void done(ParseException e)
      {
        if(e == null)
        {
          // OK
          Log.i("Sign Up OK!","We did it");
        }
        else
        {
          e.printStackTrace();
        }

      }
    });

    */


/*

   // LOGIN CODE

    ParseUser.logInInBackground("nick", "myPass", new LogInCallback() {
      @Override
      public void done(ParseUser user, ParseException e)
      {
        if(user != null )
        {
          Log.i("Success","We logged in");
        }
        else
        {
          e.printStackTrace();
        }

      }
    });


 */

/*

   // CHECK IF THERE'S CURRENTLY LOGGED IN USER

   if(ParseUser.getCurrentUser() != null)
   {
     Log.i("Signed In",ParseUser.getCurrentUser().getUsername());
   }
   else
   {
     Log.i("No luck","Not signed in");
   }


 */

/*

// TO LOG SOMEONE OUT OF THE APP

    ParseUser.logOut();

 */

/*

 //     To show all users

        ParseQuery<ParseUser> query = ParseUser.getQuery();

        // Don't get current user
        query.whereNotEqualTo("username",ParseUser.getCurrentUser().getUsername());
        // ADD IN ASCENDING ORDER
        query.addAscendingOrder("username");

        query.findInBackground(new FindCallback<ParseUser>() {
            @Override
            public void done(List<ParseUser> objects, ParseException e)
            {
                if(e == null )
                {
                    if(objects.size() > 0)
                    {
                        for (ParseUser user : objects)
                        {
                            Log.i("Username", user.getString("username"));
                            usernames.add(user.getUsername());
                        }
                        listView.setAdapter(arrayAdapter);
                    }
                }
                else
                {
                    e.printStackTrace();
                }
            }
        });

 */




    }
}
