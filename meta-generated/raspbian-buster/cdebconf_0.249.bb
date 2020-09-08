PACKAGES = "${PN} libdebconfclient0"
PROVIDES = "libdebconfclient0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/c/cdebconf/libdebconfclient0_0.249_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libdebconfclient0 = "libdebconfclient0_0.249_armhf.deb"
SRC_URI[deb0.sha256sum] = "e53056b131f28c54d9e1f719f0175ab459ce2d762cc6c3749c7618d6912f1f50"
SRC_URI[deb0.md5sum] = "d7a20a99f35c9869aaec074d47433a57"

RDEPENDS_libdebconfclient0 = "libc6 (>= 2.4)"
DEPENDS = "libc6"


inherit deb_group

FILES_libdebconfclient0 = " \
    ./usr/lib/arm-linux-gnueabihf/libdebconfclient.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libdebconfclient.so.0.0.0 \
    ./usr/share/doc/libdebconfclient0/changelog.gz \
    ./usr/share/doc/libdebconfclient0/copyright\
"
