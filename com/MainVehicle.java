package first.com;

public class MainVehicle {

	public static void main(String[] args) {
		System.out.println("___________SHOW DETAILS OF THIS THAR_____________");
		Vehicle vcl=new Vehicle();
		String tname=vcl.vname;
		int tgear=vcl.vgear;
		int ttyre=vcl.vtyres;
		int vspeed=vcl.vspeed;
		System.out.println("-----NAME OF THE VEHICLE IS"+tname+"-----------");
		System.out.println("-----THERE ARE "+tgear+" GEAR IN THIS THAR-------");
		System.out.println("-----THERE ARE "+ttyre+" WHEELS----------");
		System.out.println("-----THE MAXIMUM SPEED OF THIS THAR IS "+vspeed+" KM/H---------------");

	}

}
