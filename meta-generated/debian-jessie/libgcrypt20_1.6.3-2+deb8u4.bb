PACKAGES = "${PN} libgcrypt20"
PROVIDES = "libgcrypt20"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libg/libgcrypt20/libgcrypt20_1.6.3-2+deb8u4_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libgcrypt20 = "libgcrypt20_1.6.3-2+deb8u4_armhf.deb"
SRC_URI[deb0.sha256sum] = "ff14037031903129d74dd3c8602b166b90fd8acb0549c7566657f80974afc7b4"
SRC_URI[deb0.md5sum] = "edd6e0ef81cae3298e9134dc5081d2e6"

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
