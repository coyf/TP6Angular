package fr.sigl.imoe.rest.api;

/**
 * Exception dans le cas où un appel n'est pas valide.
 *
 * @author Chris
 */
public class ContactException extends Exception {
	/**
	 * Generated Serial Version UID.
	 */
	private static final long serialVersionUID = 4442165211948460504L;

	/**
	 * Constructeur par défaut.
	 */
    public ContactException() {
        super();
    }

    /**
     * Constructeur à partir d'un message.
     *
     * @param msg		Le message d'erreur.
     */
    public ContactException(String msg)   {
        super(msg);
    }
}
