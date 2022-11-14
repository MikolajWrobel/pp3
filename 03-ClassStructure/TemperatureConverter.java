class TemperatureConverter {
    
    double Celcius;
    double Kelvin;
    double Fahrenheit;
    
    
    public void CelciusToKelvin(){
        Kelvin = Celcius + 273;
    }    
    
    public void CelciusToFahrenheit(){
        Fahrenheit = Celcius * 1.8 + 32;
    }
    
    public void KelvinToCelcius(){
        Celcius = Kelvin - 273;
    }
    
    public void KelvinToFahrenheit(){
        Fahrenheit = (Kelvin-273) * 1.8 + 32;
    }
    
    public void FahrenheitToCelcius(){
        Celcius = (Fahrenheit - 32) / 1.8;
    }
    
    public void FahrenheitToKelvin(){
        Kelvin = (Fahrenheit-32)/1.8 + 273;
    }
    public void ShowResults(){
        System.out.println("Celcius: " + Celcius +
        "\nKelvin: " + Kelvin + 
        "\nFahrenheit: " + Fahrenheit);
    }

    public static void main(String[] args){
        TemperatureConverter tc1 = new TemperatureConverter();
        tc1.Celcius = 25;
        tc1.CelciusToKelvin();
        tc1.CelciusToFahrenheit();
        tc1.ShowResults();
        
    }
}
