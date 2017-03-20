package com.novauc;

import spark.ModelAndView;
import spark.Session;
import spark.Spark;
import spark.template.mustache.MustacheTemplateEngine;

import java.util.HashMap;

public class Main {

    static HashMap<String, User> users = new HashMap<>();

    public static void main(String[] args) {
	// write your code here
        Spark.init();




        Spark.get("/",((request, response) -> {
            HashMap m = new HashMap();

            Session session = request.session();
            String userName = session.attribute("userName");
            User user = users.get(userName);




            if (user == null){
                return new ModelAndView(m, "login.html");
            }else {
                m.put("name", user.name);
                return new ModelAndView(m, "home.html");
            }


        }), new MustacheTemplateEngine()

        );


        Spark.post("/login",((request, response) -> {


                    String name = request.queryParams("loginName");
                    User user = users.get(name);

                    if ( user == null){
                        user = new User(name);
                        users.put(name, user);
                    }

                    Session session = request.session();
                    session.attribute("userName", name);

                    response.redirect("/");
                    return "";

                })


        );
        Spark.post("/logout",((request,response) -> {
            Session session = request.session();
            session.invalidate();
            response.redirect("/");
            return "";
        })

        );

    }
}

