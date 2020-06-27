package com.blupplup.bank.common;

public class CommonConstants {

    private enum accountTypes{
        SAVINGS("1"),CURRENT("2"),RECURRING_DEPOSIT("3"),FIXED_DEPOSIT("2");

        private String values;

        public String getValues(){
            return this.values;
        }

        accountTypes(String values){
            this.values = values;
        }
    }
}
