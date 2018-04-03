PACKAGES = "${PN} libx11-6 libx11-data libx11-dev"
PROVIDES = "libx11-6 libx11-data libx11-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libx11/libx11-6_1.6.2-3+deb8u1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/libx/libx11/libx11-data_1.6.2-3+deb8u1_all.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/libx/libx11/libx11-dev_1.6.2-3+deb8u1_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_libx11-6 = "libx11-6_1.6.2-3+deb8u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "372cdede88fc91f3a38dc35e0ed025521548b66a1391c20d2ca9cfd17fea9fba"
SRC_URI[deb0.md5sum] = "973294ff68d5f261413b48b1c50b3ced"
DEBFILENAME_libx11-data = "libx11-data_1.6.2-3+deb8u1_all.deb"
SRC_URI[deb1.sha256sum] = "4879a3054d6508e86f737bf668737c3fc64980c3512b2912f18bceea823e1899"
SRC_URI[deb1.md5sum] = "a1ec8a1b0c9678bb04bc8ea13ac124fd"
DEBFILENAME_libx11-dev = "libx11-dev_1.6.2-3+deb8u1_armhf.deb"
SRC_URI[deb2.sha256sum] = "7c50f4195afba3fb57be4e97e64588f7f49e82a026de6231b199896a7dd60c75"
SRC_URI[deb2.md5sum] = "e69e406e0ed5118f976d1b8c504d50a5"

RDEPENDS_${PN}-6 = "libc6 (>= 2.15) libxcb1 (>= 1.2) libx11-data"
RDEPENDS_${PN}-dev = "libx11-6 (= 2:1.6.2-3+deb8u1) libxau-dev (>= 1:1.0.0-1) libxdmcp-dev (>= 1:1.0.0-1) x11proto-core-dev (>= 7.0.17) x11proto-input-dev x11proto-kb-dev xtrans-dev libxcb1-dev"
DEPENDS = "x11proto-kb-dev xtrans-dev x11proto-input-dev libxcb1 libxau-dev libxdmcp-dev libxcb1-dev x11proto-core-dev libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

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
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
