PACKAGES = "${PN} mime-support"
PROVIDES = "mime-support"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/m/mime-support/mime-support_3.62_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_mime-support = "mime-support_3.62_all.deb"
SRC_URI[deb0.sha256sum] = "776efd686af26fa26325450280e3305463b1faef75d82b383bb00da61893d8ca"
SRC_URI[deb0.md5sum] = "2afe5c74c9df28398663f1be782de6c3"

RDEPENDS_${PN} = ""

inherit deb_group

FILES_${PN} = " \
    ./etc/mailcap.order \
    ./etc/mime.types \
    ./usr/bin/compose \
    ./usr/bin/edit \
    ./usr/bin/print \
    ./usr/bin/run-mailcap \
    ./usr/bin/see \
    ./usr/lib/mime/debian-view \
    ./usr/lib/mime/mailcap \
    ./usr/lib/mime/packages/mime-support \
    ./usr/sbin/update-mime \
    ./usr/share/bug/mime-support/presubj \
    ./usr/share/doc/mime-support/changelog.gz \
    ./usr/share/doc/mime-support/copyright \
    ./usr/share/man/man1/compose.1.gz \
    ./usr/share/man/man1/edit.1.gz \
    ./usr/share/man/man1/print.1.gz \
    ./usr/share/man/man1/run-mailcap.1.gz \
    ./usr/share/man/man1/see.1.gz \
    ./usr/share/man/man5/mailcap.5.gz \
    ./usr/share/man/man5/mailcap.order.5.gz \
    ./usr/share/man/man8/update-mime.8.gz\
"
