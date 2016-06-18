package com.practice.piyush.customhandlers;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

/**
 * This is the Lambda handler class which consists of handler method.
 * The defined handler method needs to be mentioned in the configuration
 * of the lambdaFuntion in the lambda management console. We need to mention
 * "Handler" (configuration) as packagename.ClassName::methodName. Ex-
 * com.practice.piyush.customhandlers.MyLamdaHandle::simpleHandlerWithStringInput
 */

public class CustomHandlers {

    /**
     * This is simple handler which takes simple string name , logs the message using LambdaLogger and returns the name.
     * We can also use the Log4j loggers as well instead of the LambdaLogger.
     *
     * @param name    request input. Here, it is just the string.
     * @param context aws Context parameter which consists of the runtime informations.
     * @return String (name)
     */
    public String simpleHandlerWithStringInput(String name, Context context) {
        LambdaLogger logger = context.getLogger();

        logger.log("Hi! welcome to amazon lambda webservice :::" + name);
        return name;
    }

    /**
     * This handler takes the request input only. Context object is option in all the handler methods.
     *
     * @param input request input. Here, it is pojo class.
     * @return Person
     */
    public Person handlerWithPojoInput(Input input) {
        Person person = new Person();
        person.setName(input.getName());
        person.setAge(input.getAge());
        return person;
    }

    /**
     * This methods will take the empty json. Here, I am trying to create the Person object in the method with the hard
     * coded values.
     *
     * @param input request input. Here, it is pojo class.
     * @return Person
     */
    public Person handlerWithPojoInputAndGeneratesPersonWithHardCodedValues(Input input) {
        Person person = new Person();
        person.setName("Piyush.kumar");
        person.setAge(24);
        return person;
    }

    /**
     * This method does not takes any input. But, still when we are testing this method in the lambda management console
     * we need to provide the input json in the configure test input. It means, if we not providing any input parameter
     * in the handler method and providing the json input as {} in the configure test input, json mapper is just ignoring
     * the properties if not given while providing json in the configure test input.
     *
     * @return Person
     */
    public Person handlerWithoutInput() {
        Person person = new Person();
        person.setName("Piyush kumar kirad");
        person.setAge(24);
        return person;
    }
}
