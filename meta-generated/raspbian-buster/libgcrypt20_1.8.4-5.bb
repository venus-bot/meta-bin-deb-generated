PACKAGES = "${PN} libgcrypt20"
PROVIDES = "libgcrypt20"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libg/libgcrypt20/libgcrypt20_1.8.4-5_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libgcrypt20 = "libgcrypt20_1.8.4-5_armhf.deb"
SRC_URI[deb0.sha256sum] = "19ec0ba3e4d133ade463dedc1ca4f2b37344eab058213cc384ea14488a7272d5"
SRC_URI[deb0.md5sum] = "4409913957e780a5e5e3ca664977a67c"

RDEPENDS_${PN} = "libc6 (>= 2.28) libgpg-error0 (>= 1.25)"
DEPENDS = "libc6 libgpg-error0"


inherit deb_group

FILES_${PN} = " \
    ./lib/arm-linux-gnueabihf/libgcrypt.so.20 \
    ./lib/arm-linux-gnueabihf/libgcrypt.so.20.2.4 \
    ./usr/share/doc/libgcrypt20/AUTHORS.gz \
    ./usr/share/doc/libgcrypt20/NEWS.gz \
    ./usr/share/doc/libgcrypt20/README.gz \
    ./usr/share/doc/libgcrypt20/THANKS.gz \
    ./usr/share/doc/libgcrypt20/changelog.Debian.gz \
    ./usr/share/doc/libgcrypt20/changelog.gz \
    ./usr/share/doc/libgcrypt20/copyright\
"
