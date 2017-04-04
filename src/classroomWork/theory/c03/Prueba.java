package classroomWork.theory.c03;

public class Prueba {

	public static void main(String[] args) {
		Alien et;
		et = new Alien();
		et.setNombre("Matias");
		
		// Armo el planeta		
		Planeta astro = new Planeta();
		astro.setDenomicacion("Naboo");
		et.setOrigen(astro);
		
		// Armo la especie
		Especie bichoTipo = new Especie();
		bichoTipo.setNombreEspecie("Marsian");
		et.setQueEspecie(bichoTipo);

	}

}
