package modelComponents;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

//import org.apache.commons.math3.random.MersenneTwister;
import org.json.*;

import base.Array;
import base.MersenneTwisterFast;
import modelComponents.MultiRoundData;
import proBoundTools.Misc;
import sequenceTools.*;

public class ProfileStorage {
	ArrayList<Double> first;
	ArrayList<Double> second;
	public ProfileStorage(ArrayList<Double> first, ArrayList<Double> second) {
		this.first = first;
		this.second = second;
	}

	public Double[] getFirst()
	{
		Double[] output = new Double[first.size()];
		output = first.toArray(output);
		return output;
	}
	public Double[] getSecond()
	{
		Double[] output = new Double[second.size()];
		output = second.toArray(output);
		return output;
	}

	public String getString() {
		String colString = "" +   Misc.formatVectorE_d(this.first, ",", "", "", 5);
		colString += "\t" + Misc.formatVectorE_d(this.second, ",", "", "", 5);
		return colString;
	}
}