package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// youtube-dl -vg --print-traffic https://www.youtube.com/watch?v=v_ZPwm9vsGs

		String s =Core.getURLDASH("https://manifest.googlevideo.com/api/manifest/dash/expire/1485914398/ip/82.158.150.138/source/youtube/as/fmp4_audio_clear,webm_audio_clear,webm2_audio_clear,fmp4_sd_hd_clear,webm2_sd_hd_clear/initcwndbps/2350000/id/o-AKayPzwHrGiV0TI0lvNQAAMNa8exlC9fePJJtKi1TtON/ms/au/mn/sn-vov-h5qe/mt/1485892584/pl/16/mv/m/playback_host/r6---sn-vov-h5qe.googlevideo.com/mm/31/hfr/1/signature/6AFB833C9A90F59E4CFC7536B8E811BD7EF0C469.9F148F35FA1618EE7F30E128B63CECC03192179E/itag/0/sparams/as,hfr,id,initcwndbps,ip,ipbits,itag,mm,mn,ms,mv,pl,playback_host,requiressl,source,expire/upn/3rDmUtj3bVo/key/yt6/ipbits/0/requiressl/yes&cver=1.20170129&tts");
		String t =Core.getURLDASH("https://manifest.googlevideo.com/api/manifest/dash/upn/BiWv-YDJEBI/mt/1485901467/initcwndbps/2273750/signature/CEEEC3AD2BF1FB6FC656CAEF108E0BBD10B7743C.24A713627D4367072EA38601A2B052375886FB50/sparams/as,hfr,id,initcwndbps,ip,ipbits,itag,mm,mn,ms,mv,pl,playback_host,requiressl,source,expire/id/o-AF5QOgio_0_Oz9xH8CNBzNy8PDHyeZxGAORyLmG_rWHK/mn/sn-vov-h5qe/ms/au/hfr/1/mv/m/expire/1485923255/source/youtube/ipbits/0/playback_host/r5---sn-vov-h5qe.googlevideo.com/as/fmp4_audio_clear,webm_audio_clear,webm2_audio_clear,fmp4_sd_hd_clear,webm2_sd_hd_clear/mm/31/ip/82.158.150.138/key/yt6/requiressl/yes/itag/0/pl/16");
		System.out.println(s);
		System.out.println(t);
	}

}
