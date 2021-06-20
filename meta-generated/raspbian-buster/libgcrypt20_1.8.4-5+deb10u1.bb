PACKAGES = "${PN} libgcrypt20"
PROVIDES = "libgcrypt20"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libg/libgcrypt20/libgcrypt20_1.8.4-5+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libgcrypt20 = "libgcrypt20_1.8.4-5+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "fc52a583ee5b553b7b7820d0a38f8ec89c287906916bf0b165d8b1149ddab694"
SRC_URI[deb0.md5sum] = "44020095b2fa2ef9d92c8c1ed469c535"

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
