package model;


import java.util.ArrayList;

public class Playlist {

	
	private String nomePlaylist;
	private int idPlaylist;
	private ArrayList<Integer>playlist;
	
		public Playlist(String nomePlaylist, int idPlaylist, ArrayList<Integer> playlist) {
		super();
		this.nomePlaylist = nomePlaylist;
		this.idPlaylist = idPlaylist;
		this.playlist = playlist;
	}
		
		public String getNomePlaylist() {
		return nomePlaylist;
	}
	public void setNomePlaylist(String nomePlaylist) {
		this.nomePlaylist = nomePlaylist;
	}
	public int getIdPlaylist() {
		return idPlaylist;
	}
	public void setIdPlaylist(int idPlaylist) {
		this.idPlaylist = idPlaylist;
	}
	public ArrayList<Integer> getPlaylist() {
		return playlist;
	}
	public void setPlaylist(ArrayList<Integer> playlist) {
		this.playlist = playlist;
	}

	
	
	
	
	
	
	
	
}
