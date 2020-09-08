PACKAGES = "${PN} libtasn1-6"
PROVIDES = "libtasn1-6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libt/libtasn1-6/libtasn1-6_4.2-3+deb8u4_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libtasn1-6 = "libtasn1-6_4.2-3+deb8u4_armhf.deb"
SRC_URI[deb0.sha256sum] = "fdda3160f0ed67efbe4c529f2225902d2d8a4b805a2ff6d878ceb6d9f125ebf0"
SRC_URI[deb0.md5sum] = "0dd86d2bd2118ab33becf54413c7ac80"

RDEPENDS_${PN} = "libc6 (>= 2.4) multiarch-support"
DEPENDS = "libc6 multiarch-support"


inherit deb_group

FILES_${PN} = " \
    ./usr/lib/arm-linux-gnueabihf/libtasn1.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libtasn1.so.6.3.2 \
    ./usr/share/doc/libtasn1-6/AUTHORS \
    ./usr/share/doc/libtasn1-6/NEWS.gz \
    ./usr/share/doc/libtasn1-6/README \
    ./usr/share/doc/libtasn1-6/THANKS \
    ./usr/share/doc/libtasn1-6/changelog.Debian.gz \
    ./usr/share/doc/libtasn1-6/copyright\
"
