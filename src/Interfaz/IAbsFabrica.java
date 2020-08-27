package Interfaz;

import Enemigos.EnemigoConcreto;
import Heroe.AHeroe;

public interface IAbsFabrica {
    public IVentanaMenu FabricarVMenu();
    public IVentanaGraficos FabricarVGraficos();
    public IVentanaEquipamiento FabricarVEquipamiento();
    public IVentanaCombate FabricarVCombate(EnemigoConcreto ElEnemigo, AHeroe ElHeroe);
}
