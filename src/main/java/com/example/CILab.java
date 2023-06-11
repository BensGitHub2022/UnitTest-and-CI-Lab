package com.example;

public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        char[] chars = myString.toCharArray();
        boolean loopCondition = false;

        if (Character.isUpperCase(chars[0])) {
            for (int i = 1; i < chars.length; i++)
            {
                if (Character.isLowerCase(chars[i])) {
                    loopCondition = true;
                }
                else {
                    loopCondition = false;
                    break;
                }
            }
            if (loopCondition)
            {
                return true;
            }
        }

        if (Character.isUpperCase(chars[0])) {
            for (int i = 1; i < chars.length; i++)
            {
                if (Character.isUpperCase(chars[i])) {
                    loopCondition = true;
                }
                else {
                    loopCondition = false;
                    break;
                }
            }
            if (loopCondition)
            {
                return true;
            }
        }
        
        if (Character.isLowerCase(chars[0])) {
            for (int i = 1; i < chars.length; i++)
            {
                if (Character.isLowerCase(chars[i])) {
                    loopCondition = true;
                }
                else {
                    loopCondition = false;
                    break;
                }
            }
            if (loopCondition)
            {
                return true;
            }
        }

        return loopCondition;
    }

}

