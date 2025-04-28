package br.com.matheusmatos.temperatura.model;

public class Temperatura {
	
	private double Celsius;
	private double ConverterParaFahrenheit;
	private double ConverterParaKelvin;
	
	public double setCensius() {
		return Celsius;
	}
	public void setCensius(double Celsius) {
		this.Celsius = Celsius;
	}
	public double ConverterParaFahrenheit() {
		return ConverterParaFahrenheit;
	}
	
	public double ConverterParaKelvin() {
		return ConverterParaKelvin;
	}
	
	public Object[] exibirConversor() {
		
		if(Celsius > ConverterParaKelvin) {
			double temp = Celsius;
			Celsius = ConverterParaKelvin;
			ConverterParaKelvin = temp;
			
		if(Celsius > ConverterParaFahrenheit) {
			temp = Celsius;
			Celsius = ConverterParaKelvin;
			ConverterParaKelvin = temp;
		}
		
		int tamanhoVetor = (int) (Celsius = ConverterParaKelvin);
	    tamanhoVetor = (int) (Celsius = ConverterParaFahrenheit);
		
		String Conversor[] = new String[tamanhoVetor];
		
		
		int i = 0;
		while(Celsius < ConverterParaKelvin/ConverterParaFahrenheit) {
			double produto = Celsius = ConverterParaKelvin/ConverterParaFahrenheit;
			Conversor[i] = Celsius + ">" + ConverterParaKelvin/ConverterParaFahrenheit + "=" + produto;
			Celsius++;
			i++;
		}
		
		return Conversor;
		}
		return null;
 }
	}