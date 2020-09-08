PACKAGES = "${PN} libgcrypt20"
PROVIDES = "libgcrypt20"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libg/libgcrypt20/libgcrypt20_1.6.3-2+deb8u7_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libgcrypt20 = "libgcrypt20_1.6.3-2+deb8u7_armhf.deb"
SRC_URI[deb0.sha256sum] = "23057e8742d2b8035ff2b639b058f1907228ac0276395a96be2e124fe9f0555b"
SRC_URI[deb0.md5sum] = "3f24292ab3cf54a3e46bbb3e80690738"

RDEPENDS_${PN} = "libc6 (>= 2.15) libgpg-error0 (>= 1.14) multiarch-support"
DEPENDS = "libc6 libgpg-error0 multiarch-support"


inherit deb_group

FILES_${PN} = " \
    ./lib/arm-linux-gnueabihf/libgcrypt.so.20 \
    ./lib/arm-linux-gnueabihf/libgcrypt.so.20.0.3 \
    ./usr/share/doc/libgcrypt20/AUTHORS.gz \
    ./usr/share/doc/libgcrypt20/NEWS.gz \
    ./usr/share/doc/libgcrypt20/README.gz \
    ./usr/share/doc/libgcrypt20/THANKS.gz \
    ./usr/share/doc/libgcrypt20/changelog.Debian.gz \
    ./usr/share/doc/libgcrypt20/changelog.gz \
    ./usr/share/doc/libgcrypt20/copyright\
"
