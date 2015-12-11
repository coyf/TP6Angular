package fr.sigl.imoe.rest.api;

import java.util.ArrayList;
import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import fr.sigl.imoe.rest.pojo.Contact;
import fr.sigl.imoe.rest.pojo.Telephone;
import fr.sigl.imoe.rest.pojo.TypeTelephone;

/**
 * Exemple d'interface REST pour l'accès aux contacts.
 *
 * @author Chris
 */
@Path("/contacts")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public class ContactsManager {
	/**
	 * Injection du service delegate
	 */

	@GET
	public Collection<Contact> getContacts() {
		return null;
	}
	
	@GET
	@Path("/{idcontact}")
	public Contact getContact(@PathParam("idcontact") Integer id) throws ContactException {
		return null;
	}

	@GET
	@Path("/{idcontact}/tel/{type}")
	public Collection<Telephone> getTelephone(@PathParam("idcontact") Integer id, @PathParam("type") TypeTelephone type) throws ContactException {

		Collection<Telephone> tels = new ArrayList<Telephone>();

		return tels;
	}

	@POST
	@Path("/")
	public void addContact(Contact contact) throws ContactException {
		if (contact.getId() != null) {
			throw new ContactException("Le contact ne doit pas exister.");
		}

	}

	@PUT
	@Path("/{idcontact}")
	public void updateContact(@PathParam("idcontact") Integer id, Contact contact) throws ContactException {

	}
	
	@DELETE
	@Path("/{idcontact}")
	public void removeBook(@PathParam("idcontact") Integer id) throws ContactException {

	}
}
