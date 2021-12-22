package pooegg.ej7.entidades;

import pooegg.ej7.entidades.Persona;

public class Persona {

    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;
    private String profesion;
    private String nacionalidad;
    private string email;
    private string whatsapp;

    public Persona(String nombre, int edad, String sexo, double peso, double altura, double imc, boolean esmayor, float resultado) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(Persona JovenIT) {
        this.nombre = "MATIAS JULIAN PEREZ YERGA";
        this.edad = 31;
        this.nacionalidad = "ARGENTINO";
        this.email = "matiasyerga@gmail.com";
        this.whatsapp = "+549-2613642184";
    }

//    public void returnEducation(Persona YoungIT) {
//        System.out.println(
//                " 2021- Hoy    FULL STACK PROGRAMMER- Egg Tech Cooperation  - Mendoza, ARG\n"
//                + "2008-2017	PETROLEUM ENGINEER .  UNCuyo ENGINEERING UNIVERSITY, Mendoza, ARG.\n"
//                + "2005-2007    HIGH SCHOOL:  Martín Zapata – UNCuyo, Mendoza, ARG. Modalidad:    \n"
//                + "                            * COMPUTING services & objets production:\n"
//                + "		               * WEB DESING: DreamWeaver. HTML.\n"
//                + "	                       *  PROGRAMMING. Visual Basic.\n"
//                + "		               *  GRAPHIC DESING. Flash. Macromedia Firework.\n"
//                + "2002-2004     Secondary School D.A.D; UNCuyo, Mendoza, ARG.\n"
//                + "1996-2001     Primary School ,N°: 1-035, Dr. Manuel Quintana, Mendoza, ARG.");
//    }
    public void returnEducacion(Persona YoungIT) {
        System.out.println(
                "  2021- Hoy    FULL STACK PROGRAMMER- Egg Tech Cooperation  - Mendoza, ARG"
                + "2008-2017	PETROLEUM ENGINEER .  UNCuyo ENGINEERING UNIVERSITY, Mendoza, ARG."
                + "2005-2007    HIGH SCHOOL:  Martín Zapata – UNCuyo, Mendoza, ARG. Modalidad:"
                + "                            * COMPUTING services & objets production:"
                + "		               * WEB DESING: DreamWeaver. HTML."
                + "	                       *  PROGRAMMING. Visual Basic."
                + "		               *  GRAPHIC DESING. Flash. Macromedia Firework."
                + "2002-2004     Secondary School D.A.D; UNCuyo, Mendoza, ARG."
                + "1996-2001     Primary School ,N°: 1-035, Dr. Manuel Quintana, Mendoza, ARG.");
    }

    public void returnCursos(Persona JovenIT) {
        System.out.println(""
                + "  2021- Hoy    MASTER EN FRONT END(JavaScript, JQuery, Angular,NodeJS - UDEMY");
    }

    public void returnExperenciaLaboral(Persona JovenIT) {
        System.out.println(
                "Jun 2019 - Hoy         SUPERVISOR GENERAL DE OPERACIONES - Pecom Servicios de Energia - Mza, Arg."
                + "Ago2017- Nov 2018    INGENIERO DE CALIDAD - YPF S.A. - Mendoza Norte, Arg.  - PASANTIA"
                + "Jun 2015- Jul 2017	ENCARGADO /SUB GERENTE - La Lucia Restaurant Grill and Bar, Mza, ARG."
                + "Seasson-2014/15	WORK AND TRAVEL EXPERIENCIE EEUU - UTAH Park City,"
                + "Mar 2014- Dic 2014	AYUDANTE DE CATEDRA - FACULTAD DE INGENIERIA, UNCuyo, Mza, ARG"
                + "Ago 2013-Feb 2014	PROFESOR PRIVADO, Ingreso Ingeniería UNCuyo.                                                                                                               \n"
                + "                                       Fisica, Quimica, Matemàtica, Informatica, y Mecanica de los Fluidos."
                + "Feb 2010-Nov 2014	ENCARGADO La Lucia Restaurant Grill and Bar, Mza, ARG.");
    }
//    public void returnWorkExperiencie(Persona YoungIT) {
//        System.out.println(
//                "Jun 2019 - Hoy         OPERATIONS´S GENERAL SUPERVISOR - Pecom Energy Services - Mza, Arg.-   .\n"
//                + "Ago2017- Nov 2018    QUALITY ENGINEER - YPF S.A. - Mendoza Norte, Arg.  - INTERNISHIP.\n"
//                + "Jun 2015- Jul 2017	SHIFT MANAGER - La Lucia Restaurant Grill and Bar, Mza, ARG. .\n"
//                + "Seasson-2014/15	WOR AND TRAVEL EXPERIENCIE EEUU - UTAHPark City, Utah, EEUU.\n"
//                + "Mar 2014- Dic 2014	ASSISTANT PROFESSOR - Enginnering University, UNCuyo, Mza, ARG. \n"
//                + "Ago 2013-Feb 2014	PRIVATE TUTOR , Personal Classes. Admission Engineering, UNCuyo.                                                                                                                                                                                                  \n"
//                + "                                       Physics, Chemistry, Math, Computing & Mechanic of Fluids . \n"
//                + "Feb 2010-Nov 2014	SHIFT MANAGER La Lucia Restaurant Grill and Bar, Mza, ARG. .");
//    }

    public void returnPerfilPersonal(Persona JovenIT) {
        System.out.println(
                "Soy dinámico y proactivo. Poseo habilidades analíticas y  técnicas, fácil adaptabilidad, fluido manejo de la informática,."
                + "muy buenas relaciones interpersonales y pasión por el control y la mejora de procesos en pos de optimizar los costos "
                + "y aumentar los niveles productivos.Me considero una persona honesta, seria motivada a aprender y desarrollarme profesionalmente "
                + "y comprometida con los objetivos y el equipo laboral. ");
    }

//    public void returnABOUTME(Persona YoungIT) {
//        System.out.println(
//                "I am dynamic and proactive. I have analytical skills, easy adaptabilty, fluent computer skills,"
//                + "very good interpersonal relationships and passion for control and process improvement in order to optimize costs"
//                + "and increase productions level. I consider myself an honest person,  motivated to learn and develop professionally"
//                + "and committed to objetives and the work team.");
//    }
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public void setEsmayor(boolean esmayor) {
        this.esmayor = esmayor;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getImc() {
        return imc;
    }

    public boolean isEsmayor() {
        return esmayor;
    }

    public float getResultado() {
        return resultado;
    }

}
