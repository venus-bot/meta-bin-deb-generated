PACKAGES = "${PN} libgmp10"
PROVIDES = "libgmp10"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/g/gmp/libgmp10_6.0.0+dfsg-6_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libgmp10 = "libgmp10_6.0.0+dfsg-6_armhf.deb"
SRC_URI[deb0.sha256sum] = "a3eb58a46f59a2707839714df65d1c79d5a600de129049d2314c27e5ebbea24c"
SRC_URI[deb0.md5sum] = "4daf6063a69937ab3e6dc1141bc11359"

RDEPENDS_lib${PN}10 = "libc6 (>= 2.7) multiarch-support"
DEPENDS = "libc6 multiarch-support"


inherit deb_group

FILES_libgmp10 = " \
    ./usr/lib/arm-linux-gnueabihf/libgmp.so.10 \
    ./usr/lib/arm-linux-gnueabihf/libgmp.so.10.2.0 \
    ./usr/share/doc/libgmp10/README.Debian \
    ./usr/share/doc/libgmp10/changelog.Debian.gz \
    ./usr/share/doc/libgmp10/copyright\
"
