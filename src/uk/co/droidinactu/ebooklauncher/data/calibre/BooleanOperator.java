/*
 * Copyright 2012 Andy Aspell-Clark
 *
 * This file is part of eBookLauncher.
 * 
 * eBookLauncher is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * 
 * eBookLauncher is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with eBookLauncher. If not, see http://www.gnu.org/licenses/.
 *
 */
 package uk.co.droidinactu.ebooklauncher.data.calibre;

public final class BooleanOperator {

    public static final BooleanOperator AND = new BooleanOperator();
    public static final BooleanOperator ANDNOT = new BooleanOperator();
    public static final BooleanOperator OR = new BooleanOperator();
    public static final BooleanOperator ORNOT = new BooleanOperator();

    private BooleanOperator() {
    }

    @Override
    public String toString() {

        if (this == BooleanOperator.AND) {
            return "And";
        }
        if (this == BooleanOperator.ANDNOT) {
            return "AndNot";
        }
        if (this == BooleanOperator.ORNOT) {
            return "OrNot";
        }
        if (this == BooleanOperator.OR) {
            return "Or";
        }
        return "Unknown";
    }
}
