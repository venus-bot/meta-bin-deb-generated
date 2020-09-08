PACKAGES = "${PN} coreutils"
PROVIDES = "coreutils"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/c/coreutils/coreutils_8.23-4_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_coreutils = "coreutils_8.23-4_armhf.deb"
SRC_URI[deb0.sha256sum] = "5ee58e4740dcf75df84db41cdf5da2c2dca64dc4521af04084b67dbae90c68b7"
SRC_URI[deb0.md5sum] = "f0944e1b5b8f30d5fe8cf19431879e69"

RDEPENDS_${PN} = "libacl1 (>= 2.2.51-8) libattr1 (>= 1:2.4.46-8) libc6 (>= 2.17) libselinux1 (>= 2.1.13)"
DEPENDS = "libacl1 libattr1 libc6 libselinux1"


inherit deb_group

FILES_${PN} = " \
    ./bin/cat \
    ./bin/chgrp \
    ./bin/chmod \
    ./bin/chown \
    ./bin/cp \
    ./bin/date \
    ./bin/dd \
    ./bin/df \
    ./bin/dir \
    ./bin/echo \
    ./bin/false \
    ./bin/ln \
    ./bin/ls \
    ./bin/mkdir \
    ./bin/mknod \
    ./bin/mktemp \
    ./bin/mv \
    ./bin/pwd \
    ./bin/readlink \
    ./bin/rm \
    ./bin/rmdir \
    ./bin/sleep \
    ./bin/stty \
    ./bin/sync \
    ./bin/touch \
    ./bin/true \
    ./bin/uname \
    ./bin/vdir \
    ./usr/bin/[ \
    ./usr/bin/arch \
    ./usr/bin/base64 \
    ./usr/bin/basename \
    ./usr/bin/chcon \
    ./usr/bin/cksum \
    ./usr/bin/comm \
    ./usr/bin/csplit \
    ./usr/bin/cut \
    ./usr/bin/dircolors \
    ./usr/bin/dirname \
    ./usr/bin/du \
    ./usr/bin/env \
    ./usr/bin/expand \
    ./usr/bin/expr \
    ./usr/bin/factor \
    ./usr/bin/fmt \
    ./usr/bin/fold \
    ./usr/bin/groups \
    ./usr/bin/head \
    ./usr/bin/hostid \
    ./usr/bin/id \
    ./usr/bin/install \
    ./usr/bin/join \
    ./usr/bin/link \
    ./usr/bin/logname \
    ./usr/bin/md5sum \
    ./usr/bin/md5sum.textutils \
    ./usr/bin/mkfifo \
    ./usr/bin/nice \
    ./usr/bin/nl \
    ./usr/bin/nohup \
    ./usr/bin/nproc \
    ./usr/bin/numfmt \
    ./usr/bin/od \
    ./usr/bin/paste \
    ./usr/bin/pathchk \
    ./usr/bin/pinky \
    ./usr/bin/pr \
    ./usr/bin/printenv \
    ./usr/bin/printf \
    ./usr/bin/ptx \
    ./usr/bin/realpath \
    ./usr/bin/runcon \
    ./usr/bin/seq \
    ./usr/bin/sha1sum \
    ./usr/bin/sha224sum \
    ./usr/bin/sha256sum \
    ./usr/bin/sha384sum \
    ./usr/bin/sha512sum \
    ./usr/bin/shred \
    ./usr/bin/shuf \
    ./usr/bin/sort \
    ./usr/bin/split \
    ./usr/bin/stat \
    ./usr/bin/stdbuf \
    ./usr/bin/sum \
    ./usr/bin/tac \
    ./usr/bin/tail \
    ./usr/bin/tee \
    ./usr/bin/test \
    ./usr/bin/timeout \
    ./usr/bin/touch \
    ./usr/bin/tr \
    ./usr/bin/truncate \
    ./usr/bin/tsort \
    ./usr/bin/tty \
    ./usr/bin/unexpand \
    ./usr/bin/uniq \
    ./usr/bin/unlink \
    ./usr/bin/users \
    ./usr/bin/wc \
    ./usr/bin/who \
    ./usr/bin/whoami \
    ./usr/bin/yes \
    ./usr/lib/coreutils/libstdbuf.so \
    ./usr/sbin/chroot \
    ./usr/share/doc/coreutils/AUTHORS \
    ./usr/share/doc/coreutils/NEWS.Debian.gz \
    ./usr/share/doc/coreutils/NEWS.gz \
    ./usr/share/doc/coreutils/README.Debian \
    ./usr/share/doc/coreutils/README.gz \
    ./usr/share/doc/coreutils/THANKS.gz \
    ./usr/share/doc/coreutils/TODO.gz \
    ./usr/share/doc/coreutils/buildinfo_armhf.gz \
    ./usr/share/doc/coreutils/changelog.Debian.gz \
    ./usr/share/doc/coreutils/changelog.gz \
    ./usr/share/doc/coreutils/copyright \
    ./usr/share/info/coreutils.info.gz \
    ./usr/share/locale/af/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/be/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/bg/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/ca/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/cs/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/da/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/de/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/el/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/eo/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/es/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/et/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/eu/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/fi/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/fr/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/ga/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/gl/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/hr/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/hu/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/ia/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/id/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/it/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/ja/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/kk/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/ko/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/lg/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/lt/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/ms/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/nb/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/nl/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/pl/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/pt/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/pt_BR/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/ro/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/ru/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/sk/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/sl/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/sv/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/tr/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/uk/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/vi/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/zh_CN/LC_MESSAGES/coreutils.mo \
    ./usr/share/locale/zh_TW/LC_MESSAGES/coreutils.mo \
    ./usr/share/man/man1/[.1.gz \
    ./usr/share/man/man1/arch.1.gz \
    ./usr/share/man/man1/base64.1.gz \
    ./usr/share/man/man1/basename.1.gz \
    ./usr/share/man/man1/cat.1.gz \
    ./usr/share/man/man1/chcon.1.gz \
    ./usr/share/man/man1/chgrp.1.gz \
    ./usr/share/man/man1/chmod.1.gz \
    ./usr/share/man/man1/chown.1.gz \
    ./usr/share/man/man1/cksum.1.gz \
    ./usr/share/man/man1/comm.1.gz \
    ./usr/share/man/man1/cp.1.gz \
    ./usr/share/man/man1/csplit.1.gz \
    ./usr/share/man/man1/cut.1.gz \
    ./usr/share/man/man1/date.1.gz \
    ./usr/share/man/man1/dd.1.gz \
    ./usr/share/man/man1/df.1.gz \
    ./usr/share/man/man1/dir.1.gz \
    ./usr/share/man/man1/dircolors.1.gz \
    ./usr/share/man/man1/dirname.1.gz \
    ./usr/share/man/man1/du.1.gz \
    ./usr/share/man/man1/echo.1.gz \
    ./usr/share/man/man1/env.1.gz \
    ./usr/share/man/man1/expand.1.gz \
    ./usr/share/man/man1/expr.1.gz \
    ./usr/share/man/man1/factor.1.gz \
    ./usr/share/man/man1/false.1.gz \
    ./usr/share/man/man1/fmt.1.gz \
    ./usr/share/man/man1/fold.1.gz \
    ./usr/share/man/man1/groups.1.gz \
    ./usr/share/man/man1/head.1.gz \
    ./usr/share/man/man1/hostid.1.gz \
    ./usr/share/man/man1/id.1.gz \
    ./usr/share/man/man1/install.1.gz \
    ./usr/share/man/man1/join.1.gz \
    ./usr/share/man/man1/link.1.gz \
    ./usr/share/man/man1/ln.1.gz \
    ./usr/share/man/man1/logname.1.gz \
    ./usr/share/man/man1/ls.1.gz \
    ./usr/share/man/man1/md5sum.1.gz \
    ./usr/share/man/man1/md5sum.textutils.1.gz \
    ./usr/share/man/man1/mkdir.1.gz \
    ./usr/share/man/man1/mkfifo.1.gz \
    ./usr/share/man/man1/mknod.1.gz \
    ./usr/share/man/man1/mktemp.1.gz \
    ./usr/share/man/man1/mv.1.gz \
    ./usr/share/man/man1/nice.1.gz \
    ./usr/share/man/man1/nl.1.gz \
    ./usr/share/man/man1/nohup.1.gz \
    ./usr/share/man/man1/nproc.1.gz \
    ./usr/share/man/man1/numfmt.1.gz \
    ./usr/share/man/man1/od.1.gz \
    ./usr/share/man/man1/paste.1.gz \
    ./usr/share/man/man1/pathchk.1.gz \
    ./usr/share/man/man1/pinky.1.gz \
    ./usr/share/man/man1/pr.1.gz \
    ./usr/share/man/man1/printenv.1.gz \
    ./usr/share/man/man1/printf.1.gz \
    ./usr/share/man/man1/ptx.1.gz \
    ./usr/share/man/man1/pwd.1.gz \
    ./usr/share/man/man1/readlink.1.gz \
    ./usr/share/man/man1/realpath.1.gz \
    ./usr/share/man/man1/rm.1.gz \
    ./usr/share/man/man1/rmdir.1.gz \
    ./usr/share/man/man1/runcon.1.gz \
    ./usr/share/man/man1/seq.1.gz \
    ./usr/share/man/man1/sha1sum.1.gz \
    ./usr/share/man/man1/sha224sum.1.gz \
    ./usr/share/man/man1/sha256sum.1.gz \
    ./usr/share/man/man1/sha384sum.1.gz \
    ./usr/share/man/man1/sha512sum.1.gz \
    ./usr/share/man/man1/shred.1.gz \
    ./usr/share/man/man1/shuf.1.gz \
    ./usr/share/man/man1/sleep.1.gz \
    ./usr/share/man/man1/sort.1.gz \
    ./usr/share/man/man1/split.1.gz \
    ./usr/share/man/man1/stat.1.gz \
    ./usr/share/man/man1/stdbuf.1.gz \
    ./usr/share/man/man1/stty.1.gz \
    ./usr/share/man/man1/sum.1.gz \
    ./usr/share/man/man1/sync.1.gz \
    ./usr/share/man/man1/tac.1.gz \
    ./usr/share/man/man1/tail.1.gz \
    ./usr/share/man/man1/tee.1.gz \
    ./usr/share/man/man1/test.1.gz \
    ./usr/share/man/man1/timeout.1.gz \
    ./usr/share/man/man1/touch.1.gz \
    ./usr/share/man/man1/tr.1.gz \
    ./usr/share/man/man1/true.1.gz \
    ./usr/share/man/man1/truncate.1.gz \
    ./usr/share/man/man1/tsort.1.gz \
    ./usr/share/man/man1/tty.1.gz \
    ./usr/share/man/man1/uname.1.gz \
    ./usr/share/man/man1/unexpand.1.gz \
    ./usr/share/man/man1/uniq.1.gz \
    ./usr/share/man/man1/unlink.1.gz \
    ./usr/share/man/man1/users.1.gz \
    ./usr/share/man/man1/vdir.1.gz \
    ./usr/share/man/man1/wc.1.gz \
    ./usr/share/man/man1/who.1.gz \
    ./usr/share/man/man1/whoami.1.gz \
    ./usr/share/man/man1/yes.1.gz \
    ./usr/share/man/man8/chroot.8.gz\
"
