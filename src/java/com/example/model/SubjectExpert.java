/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;
import com.example.web.*;

import java.util.*;

public class SubjectExpert {   
   
    
   public List getTypes(String type) {

     List types = new ArrayList();
     
     if (type.equals("nebula")) {
       types.add("A nebula (Latin for \"cloud\"; pl. nebulae, nebulæ, or nebulas) is an interstellar cloud of dust, hydrogen, helium and other ionized gases. Originally, nebula was a name for any diffuse astronomical object, including galaxies beyond the Milky Way. The Andromeda Galaxy, for instance, was referred to as the Andromeda Nebula (and spiral galaxies in general as \"spiral nebulae\") before the true nature of galaxies was confirmed in the early 20th century by Vesto Slipher, Edwin Hubble and others.");
       
     }
     else if (type.equals("blackhole")) {
       types.add("A black hole is a geometrically defined region of spacetime exhibiting such strong gravitational effects that nothing, including particles and electromagnetic radiation such as light, can escape from inside it. The theory of general relativity predicts that a sufficiently compact mass can deform spacetime to form a black hole. The boundary of the region from which no escape is possible is called the event horizon. Although crossing the event horizon has enormous effect on the fate of the object crossing it, it appears to have no locally detectable features. In many ways a black hole acts like an ideal black body, as it reflects no light.");
       
     }
     else if (type.equals("redgiant")) {
       types.add("A red giant is a luminous giant star of low or intermediate mass (roughly 0.3–8 solar masses ) in a late phase of stellar evolution. The outer atmosphere is inflated and tenuous, making the radius immense and the surface temperature low, from 5,000 K and lower. The appearance of the red giant is from yellow-orange to red, including the spectral types K and M, but also class S stars and most carbon stars.");
     }
     else if (type.equals("whitedwarf")) {
       types.add("A white dwarf, also called a degenerate dwarf, is a stellar remnant composed mostly of electron-degenerate matter. A white dwarf is very dense: its mass is comparable to that of the Sun, and its volume is comparable to that of Earth. A white dwarf's faint luminosity comes from the emission of stored thermal energy. The nearest known white dwarf is Sirius B, at 8.6 light years, the smaller component of the Sirius binary star. There are currently thought to be eight white dwarfs among the hundred star systems nearest the Sun. The unusual faintness of white dwarfs was first recognized in 1910.The name white dwarf was coined by Willem Luyten in 1922.");
       
     }
     else {
       types.add("Vending Machine");
     }
     return(types);
   }   
  
   
}
