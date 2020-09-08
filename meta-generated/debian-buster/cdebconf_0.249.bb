PACKAGES = "${PN} libdebconfclient0"
PROVIDES = "libdebconfclient0"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/c/cdebconf/libdebconfclient0_0.249_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libdebconfclient0 = "libdebconfclient0_0.249_armhf.deb"
SRC_URI[deb0.sha256sum] = "b9c30db7f5fbd3e702fc26cd72ac87ae53a5538d0b866f4d1fc76bf88c56edd2"
SRC_URI[deb0.md5sum] = "0807f8868ca11943c901bdde8d61ddeb"

RDEPENDS_libdebconfclient0 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

FILES_libdebconfclient0 = " \
    ./usr/lib/arm-linux-gnueabihf/libdebconfclient.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libdebconfclient.so.0.0.0 \
    ./usr/share/doc/libdebconfclient0/changelog.gz \
    ./usr/share/doc/libdebconfclient0/copyright\
"
