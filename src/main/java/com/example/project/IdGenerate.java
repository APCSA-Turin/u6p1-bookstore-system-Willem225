package com.example.project;

public class IdGenerate {
        //sets the starting id to 99
        private static String currentId = "99";
    
        // Empty constructor
        public IdGenerate() {
        }
    
        // Getter for currentId
        public static String getCurrentId() {
            return currentId;
        }
    
        // Method to reset currentId back to 99
        public static void reset() {
            currentId = "99";
        }
    
        // Method to generate a new ID, incrementing currentId by 1
        public static String generateID() {
            int id = Integer.parseInt(currentId);
            id++;
            currentId = String.valueOf(id);
            return currentId;
        }
    }