/**
 */
package bowling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bowling.Game#getMatchups <em>Matchups</em>}</li>
 *   <li>{@link bowling.Game#getPlayer <em>Player</em>}</li>
 * </ul>
 *
 * @see bowling.BowlingPackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Matchups</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link bowling.Matchup#getGames <em>Games</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matchups</em>' container reference.
	 * @see #setMatchups(Matchup)
	 * @see bowling.BowlingPackage#getGame_Matchups()
	 * @see bowling.Matchup#getGames
	 * @model opposite="games" transient="false"
	 * @generated
	 */
	Matchup getMatchups();

	/**
	 * Sets the value of the '{@link bowling.Game#getMatchups <em>Matchups</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matchups</em>' container reference.
	 * @see #getMatchups()
	 * @generated
	 */
	void setMatchups(Matchup value);

	/**
	 * Returns the value of the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' reference.
	 * @see #setPlayer(Player)
	 * @see bowling.BowlingPackage#getGame_Player()
	 * @model
	 * @generated
	 */
	Player getPlayer();

	/**
	 * Sets the value of the '{@link bowling.Game#getPlayer <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' reference.
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(Player value);

} // Game
