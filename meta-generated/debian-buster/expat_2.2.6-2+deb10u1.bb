PACKAGES = "${PN} libexpat1"
PROVIDES = "libexpat1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/e/expat/libexpat1_2.2.6-2+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libexpat1 = "libexpat1_2.2.6-2+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "8ada16a8a8f5d96eb2dcd89de63d91e7983141ef957cdc71d34ef744f0c9b7d2"
SRC_URI[deb0.md5sum] = "3454883cebde3863f9145d5be72d9fc3"

RDEPENDS_lib${PN}1 = "libc6 (>= 2.25) libgcc1 (>= 1:3.5)"
DEPENDS = "libc6 libgcc1"


inherit deb_group

FILES_libexpat1 = " \
    ./lib/arm-linux-gnueabihf/libexpat.so.1 \
    ./lib/arm-linux-gnueabihf/libexpat.so.1.6.8 \
    ./usr/lib/arm-linux-gnueabihf/libexpatw.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libexpatw.so.1.6.8 \
    ./usr/share/doc/libexpat1/AUTHORS \
    ./usr/share/doc/libexpat1/changelog.Debian.gz \
    ./usr/share/doc/libexpat1/changelog.gz \
    ./usr/share/doc/libexpat1/copyright\
"
