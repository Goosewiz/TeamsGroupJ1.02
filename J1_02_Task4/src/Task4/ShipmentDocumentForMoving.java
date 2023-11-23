package Task4;

public class ShipmentDocumentForMoving extends ShipmentDocument {
	private String movingStorage; // название склада получения (только для перемещения)
	private String movingStrageOwner; // владелец склада получения (только для перемещения)

	/**
	 * Является ли перемещение внутренним (между складами одного владельца). Для
	 * продаж неприменимо!
	 */
	public boolean isInternalMovement() {
		return (this.storageOwner).equals(movingStrageOwner);
	}
}
