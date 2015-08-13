package com.example.systems_5.firebasetrydj;

/**
 * Created by System S-5 on 11-08-2015.
 */
public class Model {

        private int birthYear;
        private String fullName;

        public Model() {}

        public Model(String fullName, int birthYear) {
            this.fullName = fullName;
            this.birthYear = birthYear;
        }

        public long getBirthYear() {
            return birthYear;
        }

        public String getFullName() {
            return fullName;
        }



}
