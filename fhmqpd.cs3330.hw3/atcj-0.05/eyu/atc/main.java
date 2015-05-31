//Copyright (C) 2003 Zheli Erwin Yu
//
//This file is part of ATCJ.
//
//ATCJ is free software; you can redistribute it and/or modify
//it under the terms of the GNU General Public License as published by
//the Free Software Foundation; either version 2 of the License, or
//(at your option) any later version.
//
//ATCJ is distributed in the hope that it will be useful,
//but WITHOUT ANY WARRANTY; without even the implied warranty of
//MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//GNU General Public License for more details.
//
//You should have received a copy of the GNU General Public License
//along with ATCJ; if not, write to the Free Software
//Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA


import javax.swing.JFrame;
import java.lang.*;
import java.util.*;
import eyu.atc.*;

public class main{
  public static void main( String args[] )
  {
    WindowUtilities.setNativeLookAndFeel();

    String game = args.length >= 1 ? args[0] : "default";
    ATC atc = new ATC( game );

    atc.startATC();
  }

};
