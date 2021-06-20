PACKAGES = "${PN} libgcrypt20"
PROVIDES = "libgcrypt20"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libg/libgcrypt20/libgcrypt20_1.8.4-5+deb10u1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libgcrypt20 = "libgcrypt20_1.8.4-5+deb10u1_armhf.deb"
SRC_URI[deb0.sha256sum] = "ae041d91011d420c11343338b1119925c7b146fd1d47bd7bb2e1710aee665e93"
SRC_URI[deb0.md5sum] = "b8dd432f767686d072a468c4daac64b1"

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
