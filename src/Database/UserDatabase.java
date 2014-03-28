package Database;

import java.util.ArrayList;

import matches.Match;
import misc.Message;
import misc.Update;
import Admin.Subscription;
import Admin.User;

public class UserDatabase {
	private static UserDatabase self = new UserDatabase();
	public static UserDatabase get() { return self; }
	
	ArrayList<User> users = new ArrayList<User>();
	
	public UserDatabase(){
		users.add(new User("SomeOne", "1@2", "Some One","1234", new ArrayList<Message>() ,new ArrayList<Update>(), new ArrayList<Match>(), new Subscription(),"Amsterdam", "Male", "Women"));
		users.add(new User("SomeOther", "12@3", "Some Other","4321", new ArrayList<Message>() ,new ArrayList<Update>(), new ArrayList<Match>(), new Subscription(), "Amsterdam", "Male", "Men"));
		users.add(new User("Risa","elit@diamProindolor.com","Oren Hartman","HLT40MYV0BC",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Amsterdam","Female","Men"));
		users.add(new User("Kelly","sociis.natoque.penatibus@aliquam.edu","Aurora Roach","RZN17YKE6WE",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Amsterdam","Male","Women"));
		users.add(new User("Jorden","Nulla@Etiamligulatortor.edu","Kane Oneil","LUE58YFV4IO",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Bellingham","Male","Men"));
		users.add(new User("Colleen","lacus.varius@dictumeu.ca","Thor Keith","FXG23YSE1GB",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Louisville","Male","Women"));
		users.add(new User("Trevor","a.aliquet@Phasellusdapibusquam.edu","Clarke Herrera","ZQP95CDK3LV",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Irvine","Female","Women"));
		users.add(new User("Jamalia","tincidunt.nunc.ac@sedpedenec.com","TaShya Carter","OWF60QOS2NF",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Orem","Female","Women"));
		users.add(new User("Xenos","neque@magnaa.com","Shana Martin","KVF77JHP5XR",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Juneau","Female","Men"));
		users.add(new User("Pearl","vel.turpis.Aliquam@odioEtiam.org","Harriet Barrett","BUS56HYL5RD",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Laughlin","Male","Women"));
		users.add(new User("Nero","ultrices.posuere@ligula.com","Sylvia Bean","NHV16WFL6TB",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Irvine","Female","Men"));
		users.add(new User("Fallon","Maecenas@nonummyFuscefermentum.ca","Judah Mcintosh","MQZ75AHV8LM",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Glen Cove","Female","Women"));
		users.add(new User("Dai","nulla@elitpellentesque.edu","Wyatt Ray","PTZ32OVX5QK",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Kettering","Female","Men"));
		users.add(new User("Charlotte","commodo@nequevitae.org","Phoebe Jarvis","GKX43QAD6JJ",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Richland","Male","Men"));
		users.add(new User("Galvin","mi.felis.adipiscing@arcuVivamussit.org","Yetta Bright","JNN02ZIR8UA",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Carolina","Female","Men"));
		users.add(new User("Fritz","at.fringilla@vel.org","Ignacia Walters","LFA11DMS6OY",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Layton","Male","Men"));
		users.add(new User("Acton","Etiam.ligula@iaculis.com","Jenna Armstrong","DOF69EBE1EJ",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Wisconsin Rapids","Female","Women"));
		users.add(new User("Logan","Donec@euismod.com","Beverly Chang","AGU37VLH0CG",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Hot Springs","Female","Men"));
		users.add(new User("Oscar","lectus.sit.amet@velvulputateeu.ca","Fletcher Dejesus","OKY85CWU9FM",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Rutland","Male","Women"));
		users.add(new User("Xenos","purus.in.molestie@faucibusorci.com","Blaine Cross","FVK11QRO5NC",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Miami Gardens","Male","Women"));
		users.add(new User("Elaine","ante@euismod.edu","Alexandra Skinner","QKC95HDI6GM",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Spokane","Female","Women"));
		users.add(new User("Kaden","Integer.aliquam.adipiscing@ullamcorper.com","Gil May","MKN64JHV4FI",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Johnson City","Male","Women"));
		users.add(new User("Omar","Nulla.tempor@etarcu.com","Baker Santos","IDE75TFX2VJ",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Burlingame","Female","Men"));
		users.add(new User("Steven","dictum.Phasellus.in@enim.com","Alisa Solis","NPW87RFW8XJ",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Truth or Consequences","Male","Men"));
		users.add(new User("Kylynn","vulputate@NullaaliquetProin.com","Kyla Blanchard","NWJ88GJN1GF",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Oneonta","Female","Women"));
		users.add(new User("Dylan","lacinia.orci@feugiat.com","Paul Houston","DLV49XAW2WT",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Newton","Male","Women"));
		users.add(new User("Igor","non.dapibus.rutrum@molestie.ca","Grant Pickett","ROC02OES4QS",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"New Haven","Male","Women"));
		users.add(new User("Caesar","eu.enim.Etiam@Nunclectuspede.edu","Chloe Douglas","PHN56GGE3GM",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Gatlinburg","Female","Men"));
		users.add(new User("Mason","felis.Donec.tempor@tempus.ca","Hope Bolton","KEK43QCR1RH",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Santa Barbara","Female","Men"));
		users.add(new User("Orla","blandit.enim@Vivamus.edu","Nomlanga Holcomb","OZS33UUP1HY",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Woonsocket","Female","Men"));
		users.add(new User("Idola","Nulla.tincidunt.neque@Maecenas.com","Willa Rosales","NAM67XFS6PC",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Mount Vernon","Male","Men"));
		users.add(new User("Hiroko","ut@dapibusquam.edu","Robin Baker","PAF99ZMA4CT",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Areceibo","Male","Men"));
		users.add(new User("Ivan","litora@ante.ca","Ishmael Webster","EVA36BYR2XR",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Princeton","Male","Women"));
		users.add(new User("Britanney","Integer.vulputate.risus@eu.com","Logan Whitfield","SQX60WVY8EP",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Chelsea","Female","Men"));
		users.add(new User("Helen","Duis.cursus@euismod.edu","Deacon Reid","XKL30KCR3ST",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Ansonia","Male","Women"));
		users.add(new User("Victoria","nisi.Cum.sociis@sem.com","Jonas Guthrie","BPI18CAH5KH",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Effingham","Female","Men"));
		users.add(new User("Igor","aliquet.diam.Sed@odiovel.org","Hasad Fox","DMF59PQP9TL",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Amsterdam","Female","Women"));
		users.add(new User("Jolie","Suspendisse.non@Sedpharetrafelis.org","Cathleen Lowe","ZQZ60HTM5IM",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Appleton","Male","Women"));
		users.add(new User("Alika","neque.Sed@loremsit.edu","Arden Fowler","EVD79RUP6KQ",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"La Puente","Female","Men"));
		users.add(new User("Lani","pretium.aliquet@Nullatempor.edu","Malcolm Page","IFJ52RSC8NB",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Cape May","Male","Women"));
		users.add(new User("Baker","egestas.urna.justo@lectuspede.ca","Brianna Rich","PSY73RAO0PV",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Liberal","Male","Men"));
		users.add(new User("Xenos","mus@ligula.ca","Cheryl Mcmahon","JTX38RXP6QY",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Fresno","Female","Women"));
		users.add(new User("Adria","eget.dictum@etlacinia.edu","Jerry Holder","WPF87VEN7MK",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Austin","Female","Men"));
		users.add(new User("Gannon","Sed.auctor.odio@velmauris.ca","Melvin Kirk","BEW26HEG4ZA",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Aspen","Male","Men"));
		users.add(new User("Ivor","ac@Proineget.ca","Sawyer Schmidt","IMU11HEI1LZ",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Truth or Consequences","Male","Women"));
		users.add(new User("Cleo","luctus.aliquet.odio@molestie.org","Nathaniel Horne","QEO40JUN1XR",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Montebello","Male","Men"));
		users.add(new User("Zena","vitae@ultricesVivamusrhoncus.com","Bert Higgins","FJU90GNF7AG",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Goose Creek","Male","Women"));
		users.add(new User("Raya","risus.varius.orci@Aeneangravida.com","Gisela Hopper","PGD03OGS3DT",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Hope","Male","Women"));
		users.add(new User("Latifah","laoreet.posuere@ornareFuscemollis.com","Nigel Barber","WBJ24UWR9XA",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Spokane Valley","Female","Women"));
		users.add(new User("Ivy","neque.sed.dictum@massalobortisultrices.org","Ila Cox","QIL00MYD8FO",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Missoula","Female","Women"));
		users.add(new User("Arthur","nec@temporestac.com","Hadley Juarez","WFE56KEZ8GA",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Carrollton","Female","Men"));
		users.add(new User("Quon","nunc.ac@mattisCras.edu","Hope Powell","DIF57SLX8ZO",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Bridgeport","Female","Men"));
		users.add(new User("Howard","orci.luctus@sapienNunc.com","Fiona Maynard","JRD50WRK0HC",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Pittsfield","Male","Men"));
		users.add(new User("Yuli","cursus.a.enim@ullamcorper.org","Juliet Tyson","LBY83NFB6TC",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"New York","Male","Men"));
		users.add(new User("Ina","nec.quam@Mauris.com","Branden Ballard","KFI17GPT1MD",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Hilo","Female","Women"));
		users.add(new User("Tyrone","nunc.In.at@suscipitest.com","Xaviera Barlow","DCF32FVK5YD",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Worcester","Female","Women"));
		users.add(new User("Nolan","Mauris.vel.turpis@turpis.com","Akeem Barry","HOQ75RWQ8HW",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Oklahoma City","Female","Women"));
		users.add(new User("Ivor","pharetra.nibh@nonhendrerit.com","Callum Faulkner","NGL02MIV1BJ",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Palmdale","Female","Men"));
		users.add(new User("Rahim","mollis@Morbimetus.org","Sybil Wade","UIN14UQS2QZ",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Shamokin","Female","Women"));
		users.add(new User("Maggy","congue.a.aliquet@vulputate.edu","Autumn Keith","DNV63UKS2NE",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Fort Dodge","Male","Men"));
		users.add(new User("Adam","ac.orci.Ut@quamdignissimpharetra.ca","Jameson Nguyen","BTV08IEJ1VT",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Dickinson","Male","Men"));
		users.add(new User("Ezra","enim.Etiam.gravida@semmagna.com","Madeline Hardin","DLC09TBR6DN",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Brigham City","Female","Men"));
		users.add(new User("Ann","orci.Donec@Proin.org","Linda Alford","GFR68BUH1UF",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Meadville","Female","Women"));
		users.add(new User("Jessamine","amet.massa@lectusrutrum.ca","Marshall Solomon","AYZ75ZAT6RP",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Trenton","Female","Women"));
		users.add(new User("Scarlett","nisl@aliquetvel.com","Simon Leach","SLA60WRA8LO",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Amsterdam","Female","Men"));
		users.add(new User("Dakota","elit.fermentum@purus.ca","Xanthus Aguirre","XJE32SAR7RT",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"La Mirada","Male","Women"));
		users.add(new User("Emma","parturient@dignissimlacusAliquam.org","Aline Walker","KEU31UFM9OR",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Hutchinson","Female","Women"));
		users.add(new User("Aiko","euismod.et@nuncrisus.com","Rajah Nielsen","YPA56YYU7GX",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Longview","Female","Women"));
		users.add(new User("Chase","orci.in@eratvolutpat.org","Luke Knight","LCY68PQL6DB",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Gaithersburg","Female","Men"));
		users.add(new User("Shelly","id.mollis.nec@eratneque.edu","Kirby Houston","RDI27VQW7IS",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Albany","Female","Women"));
		users.add(new User("Leonard","ac@euultricessit.ca","Quentin Gardner","YDE16QWV9BP",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Amsterdam","Female","Women"));
		users.add(new User("Uma","et.magnis.dis@acurnaUt.org","Kasper Cook","QLS41AKI2PA",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Rock Springs","Female","Women"));
		users.add(new User("Kaye","amet@interdum.edu","Yvette Callahan","JXE94JOW0ZB",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Forrest City","Male","Women"));
		users.add(new User("Brenna","diam.eu@mattisvelitjusto.org","Hilary Bruce","OMH54LYJ5WU",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Appleton","Female","Men"));
		users.add(new User("Brittany","ullamcorper.magna.Sed@sitamet.org","Kiona Daniels","TLD48GZH5NT",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Moore","Female","Men"));
		users.add(new User("Kerry","elit.pretium.et@Donecegestas.com","Nero Swanson","LDR96XSC0DY",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Stanton","Male","Men"));
		users.add(new User("Shannon","egestas@urnajusto.edu","Yael Burgess","POF82CIJ7GB",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Amsterdam","Female","Women"));
		users.add(new User("Aimee","Aliquam@ligulaDonecluctus.com","Olympia Soto","LEG41JBR5YY",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Lakewood","Male","Women"));
		users.add(new User("Cairo","Quisque.fringilla@sagittisplaceratCras.org","Stewart Oneill","ZTL34ITQ5FU",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Missoula","Female","Women"));
		users.add(new User("Dorothy","Curabitur.vel@semelitpharetra.edu","Tatiana Hobbs","OTY16QEK1NW",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Anchorage","Female","Women"));
		users.add(new User("Zeph","faucibus.orci.luctus@adipiscingfringilla.edu","September Hancock","UPI84TJG7OW",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Amsterdam","Female","Women"));
		users.add(new User("Upton","dolor.dolor@massarutrummagna.ca","Victoria Richardson","QNS73CNY4IL",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Valparaiso","Female","Men"));
		users.add(new User("Emily","eleifend@NuncmaurisMorbi.ca","Noble Santos","PQV55PDC3XL",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Seaford","Male","Men"));
		users.add(new User("Adrian","aliquet.molestie@DonectinciduntDonec.edu","Dale Reese","WAB87WKJ6XZ",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"New Kensington","Male","Men"));
		users.add(new User("Adrian","tempor.lorem@vulputateullamcorpermagna.org","Shaeleigh Mcbride","EUI20BCA1XT",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Ontario","Female","Women"));
		users.add(new User("Xantha","Nulla@ipsumPhasellus.org","Liberty Madden","PLR22GLB5RB",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Redondo Beach","Male","Men"));
		users.add(new User("Nigel","dolor.sit.amet@loremvitae.edu","Gabriel Hancock","IXO05DPY8WF",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"New Iberia","Male","Women"));
		users.add(new User("Deacon","consequat.enim.diam@lobortisquama.com","Nell Finley","HBK44UTI3TV",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Frankfort","Female","Women"));
		users.add(new User("Graiden","tincidunt.adipiscing@gravidamolestiearcu.org","Dacey Duncan","BFP39XQZ3BJ",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Lewiston","Male","Men"));
		users.add(new User("Abbot","dis.parturient.montes@Proin.com","Michelle Murray","QQE28LIC0RA",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Everett","Female","Women"));
		users.add(new User("Herman","Donec@nuncnullavulputate.org","Tarik Morris","ZFT38KYN6EK",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Bradbury","Female","Men"));
		users.add(new User("Ariel","mauris.sagittis@nisisem.ca","Patricia Brown","AQW65NPT2XQ",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Evanston","Female","Men"));
		users.add(new User("Fletcher","turpis.egestas@euismodest.org","Jonas Crane","DVC05FBF0ST",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Sister Bay","Female","Women"));
		users.add(new User("Karleigh","risus@tempordiamdictum.ca","Brenda Newman","XOJ40PQW6RL",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Worland","Female","Women"));
		users.add(new User("Lacy","risus.Nunc.ac@diamPellentesque.edu","Uriah Chapman","HSH18ZZJ3MK",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Myrtle Beach","Male","Men"));
		users.add(new User("Kalia","non.bibendum@elitAliquam.ca","Ariel Roth","TMW73ACC3EY",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"New Haven","Male","Men"));
		users.add(new User("Kato","arcu.et.pede@dolor.ca","Malachi Atkins","FDA01VVR6QB",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Alpharetta","Male","Women"));
		users.add(new User("Erasmus","tellus@massalobortisultrices.edu","Irma Hinton","GOY01YGI9IN",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Kalamazoo","Male","Women"));
		users.add(new User("Brooke","aliquet.libero@massa.org","Ivy Jackson","ZJE18PLJ5MO",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Jackson","Female","Women"));
		users.add(new User("Cherokee","magna@Integermollis.ca","Priscilla Mcintosh","GXA73MUS6ZN",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Rawlins","Male","Women"));
		users.add(new User("Christopher","diam.lorem.auctor@loremtristique.ca","Ronan Barr","JLD22SLD7GM",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Sitka","Female","Men"));
		users.add(new User("Aristotle","dis.parturient@velitduisemper.edu","Abdul Anderson","MQU24VQW9VC",new ArrayList<Message>(),new ArrayList<Update>(),new ArrayList<Match>(),new Subscription(),"Hialeah","Male","Men"));
	}
	
	/**checks for the param name from the database, if not found, return null
	 * 
	 * @param name
	 * @return name, null if not found
	 */
	
	public String getByName(String name) {
		for(int i=0; i < users.size(); i++){
			if(name.equals(users.get(i).getUsername())){
				
				return name;
			}
		}
		return "null";
	}
	
	public void add(String username, String password, String email,String screenName,String location,String gender,String sexualOrientation) {
		users.add(new User(username,email,screenName, password, new ArrayList<Message>() ,new ArrayList<Update>(), new ArrayList<Match>(), new Subscription(),location,gender,sexualOrientation));
		
	}
	
	public String validate(String name, String password){
		for(int i=0; i < users.size(); i++){
			if(name.equals(users.get(i).getUsername())){
				if(users.get(i).getPassword().equals(password)){
					return users.get(i).getToken();
				}
			}
		}
		
		return "-1";
	}
	
	public boolean checkToken(String name, String recievedToken, boolean signOut){
		
		for(int i=0; i < users.size(); i++){
			if(name.equals(users.get(i).getUsername())){
				if(users.get(i).getToken().equals(recievedToken)){
					if (signOut){
						users.get(i).clearToken();
					}
					return true;
				}
			}
		}
		return false;
	}

	public User getUser(int i) {
		
		if(i < users.size()){
			return users.get(i);
		}
		else{
			return null;
		}
	}

	public User getUser(String name) {
		for(int i=0; i < users.size(); i++){
			if(name.equals(users.get(i).getUsername())){
				
				return users.get(i);
			}
		}
		return null;
	}
	
	public ArrayList<User> getAll(){
		return users;
		
	}
	
}
