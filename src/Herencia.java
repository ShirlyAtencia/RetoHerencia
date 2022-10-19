public class Herencia {
  public static void main(String[] args) {
    Cliente cliente = new Cliente();
    Trabajador trabajador = new Trabajador();
    cliente.name = "San Judas Tadeo";
    cliente.age = 20;
    cliente.telephone = 7894566;
    cliente.credit = 100;
    System.out.println(cliente.name);
    System.out.println(cliente.age);
    System.out.println(cliente.telephone);
    System.out.println(cliente.credit);
    System.out.println("//////////////////////////////");
    trabajador.name = "Santo Tomas de Aquino";
    trabajador.age = 50;
    trabajador.telephone = 8894566;
    trabajador.salario = 1000000;
    System.out.println(trabajador.name);
    System.out.println(trabajador.age);
    System.out.println(trabajador.telephone);
    System.out.println(trabajador.salario);
  }

  static class Persona {
    String name;
    int age;
    int telephone;
  }

  static class Cliente extends Persona {
    int credit;
  }

  static class Trabajador extends Persona {
    int salario;
  }
}
