PACKAGES = "${PN} libgcrypt20"
PROVIDES = "libgcrypt20"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libg/libgcrypt20/libgcrypt20_1.8.4-5_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libgcrypt20 = "libgcrypt20_1.8.4-5_armhf.deb"
SRC_URI[deb0.sha256sum] = "0f9066533b8ecce8282911a2e9858c2f79bb493b4e8e8845c638fd2f8a79ac5a"
SRC_URI[deb0.md5sum] = "c5303782466d3d84de86759c511e3555"

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
