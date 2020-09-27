PACKAGES = "${PN} libx11-6 libx11-data libx11-dev"
PROVIDES = "libx11-6 libx11-data libx11-dev"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libx/libx11/libx11-6_1.6.7-1+deb10u1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/libx/libx11/libx11-data_1.6.7-1+deb10u1_all.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/libx/libx11/libx11-dev_1.6.7-1+deb10u1_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_libx11-6 = "libx11-6_1.6.7-1+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "b3f92d1287553f4faccf37fe37dbe4f4454000668e56c29867cfe88776d1bdb0"
SRC_URI[deb0.md5sum] = "ebf3fbd065ec63b68e0679f488236766"
DEBFILENAME_libx11-data = "libx11-data_1.6.7-1+deb10u1_all.deb"
SRC_URI[deb1.sha256sum] = "02f795889390fa0e1f29c6ecdd4a30cd0aae39c0c6b1379410055404b0897c66"
SRC_URI[deb1.md5sum] = "69d2d71341cfa8346ae9df085e3f408e"
DEBFILENAME_libx11-dev = "libx11-dev_1.6.7-1+deb10u1_armhf.deb"
SRC_URI[deb2.sha256sum] = "3baf1cd0ee98d817eba6f5e84f6d7f845dac54ae538add8c38cb2e231bd953d2"
SRC_URI[deb2.md5sum] = "237cc39f30e2837d9ed43050cd4af8fd"

RDEPENDS_${PN}-6 = "libc6 (>= 2.28) libx11-data libxcb1 (>= 1.11.1)"
RDEPENDS_${PN}-data = ""
RDEPENDS_${PN}-dev = "libx11-6 (= 2:1.6.7-1+deb10u1) libxau-dev (>= 1:1.0.0-1) libxcb1-dev libxdmcp-dev (>= 1:1.0.0-1) x11proto-core-dev (>= 7.0.17) x11proto-input-dev x11proto-kb-dev xtrans-dev"
DEPENDS = "libc6 libxau-dev libxcb1 libxcb1-dev libxdmcp-dev x11proto-core-dev x11proto-input-dev x11proto-kb-dev xtrans-dev"


inherit deb_group

FILES_libx11-6 = " \
    ./usr/lib/arm-linux-gnueabihf/libX11.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libX11.so.6.3.0 \
    ./usr/share/doc/libx11-6/NEWS.Debian.gz \
    ./usr/share/doc/libx11-6/NEWS.gz \
    ./usr/share/doc/libx11-6/changelog.Debian.gz \
    ./usr/share/doc/libx11-6/changelog.gz \
    ./usr/share/doc/libx11-6/copyright \
    ./usr/share/lintian/overrides/libx11-6\
"
FILES_libx11-data = " \
    ./usr/share/X11/XErrorDB \
    ./usr/share/X11/locale/C/Compose \
    ./usr/share/X11/locale/C/XI18N_OBJS \
    ./usr/share/X11/locale/C/XLC_LOCALE \
    ./usr/share/X11/locale/am_ET.UTF-8/Compose \
    ./usr/share/X11/locale/am_ET.UTF-8/XI18N_OBJS \
    ./usr/share/X11/locale/am_ET.UTF-8/XLC_LOCALE \
    ./usr/share/X11/locale/armscii-8/Compose \
    ./usr/share/X11/locale/armscii-8/XI18N_OBJS \
    ./usr/share/X11/locale/armscii-8/XLC_LOCALE \
    ./usr/share/X11/locale/compose.dir \
    ./usr/share/X11/locale/cs_CZ.UTF-8/Compose \
    ./usr/share/X11/locale/cs_CZ.UTF-8/XI18N_OBJS \
    ./usr/share/X11/locale/cs_CZ.UTF-8/XLC_LOCALE \
    ./usr/share/X11/locale/el_GR.UTF-8/Compose \
    ./usr/share/X11/locale/el_GR.UTF-8/XI18N_OBJS \
    ./usr/share/X11/locale/el_GR.UTF-8/XLC_LOCALE \
    ./usr/share/X11/locale/en_US.UTF-8/Compose \
    ./usr/share/X11/locale/en_US.UTF-8/XI18N_OBJS \
    ./usr/share/X11/locale/en_US.UTF-8/XLC_LOCALE \
    ./usr/share/X11/locale/fi_FI.UTF-8/Compose \
    ./usr/share/X11/locale/fi_FI.UTF-8/XI18N_OBJS \
    ./usr/share/X11/locale/fi_FI.UTF-8/XLC_LOCALE \
    ./usr/share/X11/locale/georgian-academy/Compose \
    ./usr/share/X11/locale/georgian-academy/XI18N_OBJS \
    ./usr/share/X11/locale/georgian-academy/XLC_LOCALE \
    ./usr/share/X11/locale/georgian-ps/Compose \
    ./usr/share/X11/locale/georgian-ps/XI18N_OBJS \
    ./usr/share/X11/locale/georgian-ps/XLC_LOCALE \
    ./usr/share/X11/locale/ibm-cp1133/Compose \
    ./usr/share/X11/locale/ibm-cp1133/XI18N_OBJS \
    ./usr/share/X11/locale/ibm-cp1133/XLC_LOCALE \
    ./usr/share/X11/locale/iscii-dev/Compose \
    ./usr/share/X11/locale/iscii-dev/XI18N_OBJS \
    ./usr/share/X11/locale/iscii-dev/XLC_LOCALE \
    ./usr/share/X11/locale/isiri-3342/Compose \
    ./usr/share/X11/locale/isiri-3342/XI18N_OBJS \
    ./usr/share/X11/locale/isiri-3342/XLC_LOCALE \
    ./usr/share/X11/locale/iso8859-1/Compose \
    ./usr/share/X11/locale/iso8859-1/XI18N_OBJS \
    ./usr/share/X11/locale/iso8859-1/XLC_LOCALE \
    ./usr/share/X11/locale/iso8859-10/Compose \
    ./usr/share/X11/locale/iso8859-10/XI18N_OBJS \
    ./usr/share/X11/locale/iso8859-10/XLC_LOCALE \
    ./usr/share/X11/locale/iso8859-11/Compose \
    ./usr/share/X11/locale/iso8859-11/XI18N_OBJS \
    ./usr/share/X11/locale/iso8859-11/XLC_LOCALE \
    ./usr/share/X11/locale/iso8859-13/Compose \
    ./usr/share/X11/locale/iso8859-13/XI18N_OBJS \
    ./usr/share/X11/locale/iso8859-13/XLC_LOCALE \
    ./usr/share/X11/locale/iso8859-14/Compose \
    ./usr/share/X11/locale/iso8859-14/XI18N_OBJS \
    ./usr/share/X11/locale/iso8859-14/XLC_LOCALE \
    ./usr/share/X11/locale/iso8859-15/Compose \
    ./usr/share/X11/locale/iso8859-15/XI18N_OBJS \
    ./usr/share/X11/locale/iso8859-15/XLC_LOCALE \
    ./usr/share/X11/locale/iso8859-2/Compose \
    ./usr/share/X11/locale/iso8859-2/XI18N_OBJS \
    ./usr/share/X11/locale/iso8859-2/XLC_LOCALE \
    ./usr/share/X11/locale/iso8859-3/Compose \
    ./usr/share/X11/locale/iso8859-3/XI18N_OBJS \
    ./usr/share/X11/locale/iso8859-3/XLC_LOCALE \
    ./usr/share/X11/locale/iso8859-4/Compose \
    ./usr/share/X11/locale/iso8859-4/XI18N_OBJS \
    ./usr/share/X11/locale/iso8859-4/XLC_LOCALE \
    ./usr/share/X11/locale/iso8859-5/Compose \
    ./usr/share/X11/locale/iso8859-5/XI18N_OBJS \
    ./usr/share/X11/locale/iso8859-5/XLC_LOCALE \
    ./usr/share/X11/locale/iso8859-6/Compose \
    ./usr/share/X11/locale/iso8859-6/XI18N_OBJS \
    ./usr/share/X11/locale/iso8859-6/XLC_LOCALE \
    ./usr/share/X11/locale/iso8859-7/Compose \
    ./usr/share/X11/locale/iso8859-7/XI18N_OBJS \
    ./usr/share/X11/locale/iso8859-7/XLC_LOCALE \
    ./usr/share/X11/locale/iso8859-8/Compose \
    ./usr/share/X11/locale/iso8859-8/XI18N_OBJS \
    ./usr/share/X11/locale/iso8859-8/XLC_LOCALE \
    ./usr/share/X11/locale/iso8859-9/Compose \
    ./usr/share/X11/locale/iso8859-9/XI18N_OBJS \
    ./usr/share/X11/locale/iso8859-9/XLC_LOCALE \
    ./usr/share/X11/locale/iso8859-9e/Compose \
    ./usr/share/X11/locale/iso8859-9e/XI18N_OBJS \
    ./usr/share/X11/locale/iso8859-9e/XLC_LOCALE \
    ./usr/share/X11/locale/ja.JIS/Compose \
    ./usr/share/X11/locale/ja.JIS/XI18N_OBJS \
    ./usr/share/X11/locale/ja.JIS/XLC_LOCALE \
    ./usr/share/X11/locale/ja.SJIS/Compose \
    ./usr/share/X11/locale/ja.SJIS/XI18N_OBJS \
    ./usr/share/X11/locale/ja.SJIS/XLC_LOCALE \
    ./usr/share/X11/locale/ja/Compose \
    ./usr/share/X11/locale/ja/XI18N_OBJS \
    ./usr/share/X11/locale/ja/XLC_LOCALE \
    ./usr/share/X11/locale/ja_JP.UTF-8/Compose \
    ./usr/share/X11/locale/ja_JP.UTF-8/XI18N_OBJS \
    ./usr/share/X11/locale/ja_JP.UTF-8/XLC_LOCALE \
    ./usr/share/X11/locale/km_KH.UTF-8/Compose \
    ./usr/share/X11/locale/km_KH.UTF-8/XI18N_OBJS \
    ./usr/share/X11/locale/km_KH.UTF-8/XLC_LOCALE \
    ./usr/share/X11/locale/ko/Compose \
    ./usr/share/X11/locale/ko/XI18N_OBJS \
    ./usr/share/X11/locale/ko/XLC_LOCALE \
    ./usr/share/X11/locale/ko_KR.UTF-8/Compose \
    ./usr/share/X11/locale/ko_KR.UTF-8/XI18N_OBJS \
    ./usr/share/X11/locale/ko_KR.UTF-8/XLC_LOCALE \
    ./usr/share/X11/locale/koi8-c/Compose \
    ./usr/share/X11/locale/koi8-c/XI18N_OBJS \
    ./usr/share/X11/locale/koi8-c/XLC_LOCALE \
    ./usr/share/X11/locale/koi8-r/Compose \
    ./usr/share/X11/locale/koi8-r/XI18N_OBJS \
    ./usr/share/X11/locale/koi8-r/XLC_LOCALE \
    ./usr/share/X11/locale/koi8-u/Compose \
    ./usr/share/X11/locale/koi8-u/XI18N_OBJS \
    ./usr/share/X11/locale/koi8-u/XLC_LOCALE \
    ./usr/share/X11/locale/locale.alias \
    ./usr/share/X11/locale/locale.dir \
    ./usr/share/X11/locale/microsoft-cp1251/Compose \
    ./usr/share/X11/locale/microsoft-cp1251/XI18N_OBJS \
    ./usr/share/X11/locale/microsoft-cp1251/XLC_LOCALE \
    ./usr/share/X11/locale/microsoft-cp1255/Compose \
    ./usr/share/X11/locale/microsoft-cp1255/XI18N_OBJS \
    ./usr/share/X11/locale/microsoft-cp1255/XLC_LOCALE \
    ./usr/share/X11/locale/microsoft-cp1256/Compose \
    ./usr/share/X11/locale/microsoft-cp1256/XI18N_OBJS \
    ./usr/share/X11/locale/microsoft-cp1256/XLC_LOCALE \
    ./usr/share/X11/locale/mulelao-1/Compose \
    ./usr/share/X11/locale/mulelao-1/XI18N_OBJS \
    ./usr/share/X11/locale/mulelao-1/XLC_LOCALE \
    ./usr/share/X11/locale/nokhchi-1/Compose \
    ./usr/share/X11/locale/nokhchi-1/XI18N_OBJS \
    ./usr/share/X11/locale/nokhchi-1/XLC_LOCALE \
    ./usr/share/X11/locale/pt_BR.UTF-8/Compose \
    ./usr/share/X11/locale/pt_BR.UTF-8/XI18N_OBJS \
    ./usr/share/X11/locale/pt_BR.UTF-8/XLC_LOCALE \
    ./usr/share/X11/locale/pt_PT.UTF-8/Compose \
    ./usr/share/X11/locale/pt_PT.UTF-8/XI18N_OBJS \
    ./usr/share/X11/locale/pt_PT.UTF-8/XLC_LOCALE \
    ./usr/share/X11/locale/ru_RU.UTF-8/Compose \
    ./usr/share/X11/locale/ru_RU.UTF-8/XI18N_OBJS \
    ./usr/share/X11/locale/ru_RU.UTF-8/XLC_LOCALE \
    ./usr/share/X11/locale/sr_CS.UTF-8/Compose \
    ./usr/share/X11/locale/sr_CS.UTF-8/XI18N_OBJS \
    ./usr/share/X11/locale/sr_CS.UTF-8/XLC_LOCALE \
    ./usr/share/X11/locale/tatar-cyr/Compose \
    ./usr/share/X11/locale/tatar-cyr/XI18N_OBJS \
    ./usr/share/X11/locale/tatar-cyr/XLC_LOCALE \
    ./usr/share/X11/locale/th_TH.UTF-8/Compose \
    ./usr/share/X11/locale/th_TH.UTF-8/XI18N_OBJS \
    ./usr/share/X11/locale/th_TH.UTF-8/XLC_LOCALE \
    ./usr/share/X11/locale/th_TH/Compose \
    ./usr/share/X11/locale/th_TH/XI18N_OBJS \
    ./usr/share/X11/locale/th_TH/XLC_LOCALE \
    ./usr/share/X11/locale/tscii-0/Compose \
    ./usr/share/X11/locale/tscii-0/XI18N_OBJS \
    ./usr/share/X11/locale/tscii-0/XLC_LOCALE \
    ./usr/share/X11/locale/vi_VN.tcvn/Compose \
    ./usr/share/X11/locale/vi_VN.tcvn/XI18N_OBJS \
    ./usr/share/X11/locale/vi_VN.tcvn/XLC_LOCALE \
    ./usr/share/X11/locale/vi_VN.viscii/Compose \
    ./usr/share/X11/locale/vi_VN.viscii/XI18N_OBJS \
    ./usr/share/X11/locale/vi_VN.viscii/XLC_LOCALE \
    ./usr/share/X11/locale/zh_CN.UTF-8/Compose \
    ./usr/share/X11/locale/zh_CN.UTF-8/XI18N_OBJS \
    ./usr/share/X11/locale/zh_CN.UTF-8/XLC_LOCALE \
    ./usr/share/X11/locale/zh_CN.gb18030/Compose \
    ./usr/share/X11/locale/zh_CN.gb18030/XI18N_OBJS \
    ./usr/share/X11/locale/zh_CN.gb18030/XLC_LOCALE \
    ./usr/share/X11/locale/zh_CN.gbk/Compose \
    ./usr/share/X11/locale/zh_CN.gbk/XI18N_OBJS \
    ./usr/share/X11/locale/zh_CN.gbk/XLC_LOCALE \
    ./usr/share/X11/locale/zh_CN/Compose \
    ./usr/share/X11/locale/zh_CN/XI18N_OBJS \
    ./usr/share/X11/locale/zh_CN/XLC_LOCALE \
    ./usr/share/X11/locale/zh_HK.UTF-8/Compose \
    ./usr/share/X11/locale/zh_HK.UTF-8/XI18N_OBJS \
    ./usr/share/X11/locale/zh_HK.UTF-8/XLC_LOCALE \
    ./usr/share/X11/locale/zh_HK.big5/Compose \
    ./usr/share/X11/locale/zh_HK.big5/XI18N_OBJS \
    ./usr/share/X11/locale/zh_HK.big5/XLC_LOCALE \
    ./usr/share/X11/locale/zh_HK.big5hkscs/Compose \
    ./usr/share/X11/locale/zh_HK.big5hkscs/XI18N_OBJS \
    ./usr/share/X11/locale/zh_HK.big5hkscs/XLC_LOCALE \
    ./usr/share/X11/locale/zh_TW.UTF-8/Compose \
    ./usr/share/X11/locale/zh_TW.UTF-8/XI18N_OBJS \
    ./usr/share/X11/locale/zh_TW.UTF-8/XLC_LOCALE \
    ./usr/share/X11/locale/zh_TW.big5/Compose \
    ./usr/share/X11/locale/zh_TW.big5/XI18N_OBJS \
    ./usr/share/X11/locale/zh_TW.big5/XLC_LOCALE \
    ./usr/share/X11/locale/zh_TW/Compose \
    ./usr/share/X11/locale/zh_TW/XI18N_OBJS \
    ./usr/share/X11/locale/zh_TW/XLC_LOCALE \
    ./usr/share/doc/libx11-data/changelog.Debian.gz \
    ./usr/share/doc/libx11-data/changelog.gz \
    ./usr/share/doc/libx11-data/copyright \
    ./usr/share/man/man5/Compose.5.gz \
    ./usr/share/man/man5/XCompose.5.gz\
"
FILES_${PN}-dev = " \
    ./usr/include/X11/ImUtil.h \
    ./usr/include/X11/XKBlib.h \
    ./usr/include/X11/Xcms.h \
    ./usr/include/X11/Xlib.h \
    ./usr/include/X11/XlibConf.h \
    ./usr/include/X11/Xlibint.h \
    ./usr/include/X11/Xlocale.h \
    ./usr/include/X11/Xregion.h \
    ./usr/include/X11/Xresource.h \
    ./usr/include/X11/Xutil.h \
    ./usr/include/X11/cursorfont.h \
    ./usr/lib/arm-linux-gnueabihf/libX11.a \
    ./usr/lib/arm-linux-gnueabihf/libX11.so \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/x11.pc \
    ./usr/share/doc/libx11-dev/changelog.Debian.gz \
    ./usr/share/doc/libx11-dev/changelog.gz \
    ./usr/share/doc/libx11-dev/copyright\
"
