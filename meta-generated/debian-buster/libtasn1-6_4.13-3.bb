PACKAGES = "${PN} libtasn1-6"
PROVIDES = "libtasn1-6"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libt/libtasn1-6/libtasn1-6_4.13-3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libtasn1-6 = "libtasn1-6_4.13-3_armhf.deb"
SRC_URI[deb0.sha256sum] = "84a3526833840f88593a973fddb2bf8808d756155d48369b7a8254b85fbf8215"
SRC_URI[deb0.md5sum] = "6e17a2b033347fc3504cafbb469c3d94"

RDEPENDS_${PN} = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

FILES_${PN} = " \
    ./usr/lib/arm-linux-gnueabihf/libtasn1.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libtasn1.so.6.5.5 \
    ./usr/share/doc/libtasn1-6/AUTHORS \
    ./usr/share/doc/libtasn1-6/README \
    ./usr/share/doc/libtasn1-6/THANKS \
    ./usr/share/doc/libtasn1-6/changelog.Debian.gz \
    ./usr/share/doc/libtasn1-6/changelog.gz \
    ./usr/share/doc/libtasn1-6/copyright\
"
