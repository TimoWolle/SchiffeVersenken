package project.staedtezerstoeren;

import entity.Field;
import entity.Game;
import entity.enumeration.Oriantation;
import entity.enumeration.ShipType;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public final class DrawUtil {

    /**
     * Draws the squares of the two players with all the corresponding ships.
     * Ships are shown as full spaces (■) while unoccupied spaces are shown as empty spaces (□).
     *
     * @param game Game - The game which fields should be drawn
     */

    public static void drawFields(Game game) {
        System.out.println();
        drawField(game.getFieldPlayerOne());

        System.out.println();
        drawField(game.getFieldPlayerTwo());
    }


    /**
     * Draws the squares of one field with all placed ships.
     * Ships are shown as full spaces (■) while unoccupied spaces are shown as empty spaces (□).
     *
     * @param field Field - The field which should be drawn
     */

    public static void drawField(Field field) {
        final String FIELD_EMPTY  = "□";
        final String FIELD_FILLED = "■";

        // ...
    }
}
