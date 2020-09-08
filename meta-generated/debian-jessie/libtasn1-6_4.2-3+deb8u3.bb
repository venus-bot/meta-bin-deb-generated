PACKAGES = "${PN} libtasn1-6"
PROVIDES = "libtasn1-6"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libt/libtasn1-6/libtasn1-6_4.2-3+deb8u3_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libtasn1-6 = "libtasn1-6_4.2-3+deb8u3_armhf.deb"
SRC_URI[deb0.sha256sum] = "abc6dbe357880682ba3602d9f879ff67fe1aee82595f88c96cc35c67964550d3"
SRC_URI[deb0.md5sum] = "e8594689e1f8ecb1b6da6335aaf07b98"

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
