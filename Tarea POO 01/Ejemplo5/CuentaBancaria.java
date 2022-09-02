package Ejemplo5;

class CuentaBancaria

{

	int numeroCuenta;
	float saldo;
	String tipoCuenta;


public static void main(String[] args)
	{
		CuentaBancaria cuentaBancaria = new CuentaBancaria();

		 cuentaBancaria.numeroCuenta = 11112000;
		 cuentaBancaria.saldo = 500;
		 cuentaBancaria.tipoCuenta = "ahorros";

		System.out.println(cuentaBancaria);

		System.out.println("numero de cuenta: "+cuentaBancaria.numeroCuenta);

		System.out.println("saldo disponible: "+cuentaBancaria.saldo);

		System.out.println("tipo de cuenta: "+cuentaBancaria.tipoCuenta);

	}

}