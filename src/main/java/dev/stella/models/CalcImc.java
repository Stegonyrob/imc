package dev.stella.models;

public class CalcImc {
    
        public static void main(String[] args) {
            double weight = 80.0;
            double  height= 1.80;
    
            double  imc = CalcIMC(weight, height);
    
            System.out.println("El IMC es: " + imc);
            System.out.println("Clasificación de peso: " + ClasifWeight( imc));
        }
    
        public static double  CalcIMC( double  weight, double  height) {
            return weight / Math.pow(height, 2);
        }
    
        public static String ClasifWeight(double  imc) {
            if (imc < 16) {
                return "Delgadez severa";
            } else if (imc >= 16 && imc < 17) {
                return "Delgadez moderada";
            } else if (imc >= 17 && imc < 18.5) {
                return "Delgadez leve";
            } else if (imc >= 18.5 && imc < 25) {
                return "Peso normal";
            } else if (imc >= 25 && imc < 30) {
                return "Sobrepeso";
            } else if (imc >= 30 && imc < 35) {
                return "Obesidad leve";
            } else if (imc >= 35 && imc < 40) {
                return "Obesidad moderada";
            } else {
                return "Obesidad mórbida";
            }
        }
    }
    

