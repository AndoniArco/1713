import com.ipartek.formacion.Perro;
import com.ipartek.formacion.PerroPresa;
import com.ipartek.formacion.Person;

public class HelloWorld {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String nombre= "Andoni";
		Person p1 = new Person();
		p1.setNombre("Manolo");
		System.out.println(p1.toString());
		///////////perros
		
		Perro c1 = new Perro();
		c1.setEdad(-10);
		c1.setNombre("Bimba");
		c1.setRaza("Caniche");
		c1.setVacunado(true);
		
		System.out.println(c1.toString());
		
		
		Perro c2 = new Perro();
		c2.setEdad(10);
		c2.setNombre("Wolf");
		c2.setRaza("Pastor Alemán");
		c2.setVacunado(false);
		
		System.out.println(c2.toString());
		
		Perro c3 = new Perro();
		c3.setEdad(3);
		c3.setNombre("Treh");
		c3.setRaza("Bulldog Francés");
		c3.setVacunado(false);
		
		System.out.println(c3.toString());
		
		PerroPresa c4 = new PerroPresa();
		c4.setEdad(7);
		c4.atacar();
		
		
	}

}
